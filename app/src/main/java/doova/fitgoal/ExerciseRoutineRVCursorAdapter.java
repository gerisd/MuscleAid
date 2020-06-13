package doova.fitgoal;

import android.database.Cursor;
import android.database.DataSetObserver;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

public abstract class ExerciseRoutineRVCursorAdapter<VH extends RecyclerView.ViewHolder> extends
    RecyclerView.Adapter<VH> {

    private Cursor mCursor;
    private boolean mDatavalid;
    private int mRowIDcol;

    public ExerciseRoutineRVCursorAdapter(Cursor cursor){
        setHasStableIds(true);
        swapCursor(cursor);
    }

    public abstract VH onCreateViewHolder(ViewGroup parent, int viewType);

    protected abstract void onBindViewHolder(VH holder, Cursor cursor);

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        if(!mDatavalid){
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if(!mCursor.moveToPosition(position)){
            throw new IllegalStateException("Couldn't move ucrsor to position" + position);
        }
        onBindViewHolder(holder, mCursor);
    }

    @Override
    public long getItemId(int position) {
        if(mDatavalid && mCursor != null && mCursor.moveToPosition(position)){
            return mCursor.getLong(mRowIDcol);
        }
        return RecyclerView.NO_ID;
    }

    @Override
    public int getItemCount() {
        if(mDatavalid && mCursor != null){
            return mCursor.getCount();
        }
        else{
            return 0;
        }
    }

    protected Cursor getCursor(){
        return mCursor;
    }

    public void changeCursor(Cursor cursor){
        Cursor old = swapCursor(cursor);
        if(old != null){
            old.close();
        }
    }

    public Cursor swapCursor(Cursor newCursor){
        if(newCursor == mCursor){
            return null;
        }

        Cursor oldCursor = mCursor;
        if(oldCursor != null){
            if(mDataSetObserver != null){
                newCursor.registerDataSetObserver(mDataSetObserver);
            }
            mRowIDcol = newCursor.getColumnIndexOrThrow("_id");
            mDatavalid = true;
            notifyDataSetChanged();
        }
        else{
            mRowIDcol = -1;
            mDatavalid = false;
            notifyDataSetChanged();
        }
        return oldCursor;
    }

    private DataSetObserver mDataSetObserver = new DataSetObserver() {
        @Override
        public void onChanged() {
            mDatavalid = true;
            notifyDataSetChanged();
        }

        @Override
        public void onInvalidated() {
            mDatavalid = false;
            notifyDataSetChanged();
        }
    };
}
