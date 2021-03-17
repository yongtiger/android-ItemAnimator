package cc.brainbook.android.itemanimator;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by mikepenz on 08.01.16.
 * Base for this animator thanks to @gabrielemariotti - https://github.com/gabrielemariotti/RecyclerViewItemAnimators
 */
public class SlideInOutTopAnimator extends DefaultAnimator<SlideInOutTopAnimator> {

    private float mDeltaY;
    private RecyclerView mRecyclerView;

    public SlideInOutTopAnimator(RecyclerView recyclerView) {
        mRecyclerView = recyclerView;
    }

    @Override
    public void addAnimationPrepare(@NonNull RecyclerView.ViewHolder holder) {
        retrieveItemPosition(holder);
        ViewCompat.setTranslationY(holder.itemView, +mDeltaY);
        ViewCompat.setTranslationZ(holder.itemView, 100);
    }

    @Override
    public ViewPropertyAnimatorCompat addAnimation(@NonNull RecyclerView.ViewHolder holder) {
        final View view = holder.itemView;
        return ViewCompat.animate(view).translationY(0).alpha(1).setDuration(getAddDuration());
    }

    @Override
    public void addAnimationCleanup(@NonNull RecyclerView.ViewHolder holder) {
        ViewCompat.setAlpha(holder.itemView, 1);
        ViewCompat.setTranslationY(holder.itemView, 0);
        ViewCompat.setTranslationZ(holder.itemView, 1);
    }

    @Override
    public ViewPropertyAnimatorCompat removeAnimation(@NonNull RecyclerView.ViewHolder holder) {
        ViewCompat.setTranslationZ(holder.itemView, 100);
        final ViewPropertyAnimatorCompat animation = ViewCompat.animate(holder.itemView);
        return animation.setDuration(getRemoveDuration()).alpha(0).translationY(+mDeltaY);
    }

    @Override
    public void removeAnimationCleanup(@NonNull RecyclerView.ViewHolder holder) {
        ViewCompat.setTranslationY(holder.itemView, 0);
        ViewCompat.setAlpha(holder.itemView, 1);
        ViewCompat.setTranslationZ(holder.itemView, 1);
    }


    private void retrieveItemPosition(@NonNull final RecyclerView.ViewHolder holder) {
        mDeltaY = mRecyclerView.getHeight() - mRecyclerView.getLayoutManager().getDecoratedTop(holder.itemView);
    }

    @Override
    public long getAddDelay(long remove, long move, long change) {
        return 0;
    }

    @Override
    public long getRemoveDelay(long remove, long move, long change) {
        return remove / 2;
    }

}
