package cc.brainbook.android.itemanimator;

import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by mikepenz on 08.01.16.
 */
public class DefaultAnimator<T> extends BaseItemAnimator<T> {
    // ADD ANIMATION METHODS

    public void addAnimationPrepare(@NonNull RecyclerView.ViewHolder holder) {
        ViewCompat.setAlpha(holder.itemView, 0);
    }

    public ViewPropertyAnimatorCompat addAnimation(@NonNull RecyclerView.ViewHolder holder) {
        return ViewCompat.animate(holder.itemView).alpha(1).setDuration(getAddDuration()).setInterpolator(getInterpolator());
    }

    public void addAnimationCleanup(@NonNull RecyclerView.ViewHolder holder) {
        ViewCompat.setAlpha(holder.itemView, 1);
    }

    // REMOVE ANIMATION METHODS

    public ViewPropertyAnimatorCompat removeAnimation(@NonNull RecyclerView.ViewHolder holder) {
        return ViewCompat.animate(holder.itemView).setDuration(getRemoveDuration()).alpha(0).setInterpolator(getInterpolator());
    }

    public void removeAnimationCleanup(@NonNull RecyclerView.ViewHolder holder) {
        ViewCompat.setAlpha(holder.itemView, 1);
    }

    // CHANGE ANIMATION METHODS
    public ViewPropertyAnimatorCompat changeOldAnimation(@NonNull RecyclerView.ViewHolder holder, ChangeInfo changeInfo) {
        return ViewCompat.animate(holder.itemView).setDuration(getChangeDuration()).alpha(0).translationX(changeInfo.toX - changeInfo.fromX).translationY(changeInfo.toY - changeInfo.fromY).setInterpolator(getInterpolator());
    }

    public ViewPropertyAnimatorCompat changeNewAnimation(@NonNull RecyclerView.ViewHolder holder) {
        return ViewCompat.animate(holder.itemView).translationX(0).translationY(0).setDuration(getChangeDuration()).alpha(1).setInterpolator(getInterpolator());
    }

    public void changeAnimationCleanup(@NonNull RecyclerView.ViewHolder holder) {
        ViewCompat.setAlpha(holder.itemView, 1);
    }
}
