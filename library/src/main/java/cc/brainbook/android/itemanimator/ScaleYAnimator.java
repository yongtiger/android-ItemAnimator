package cc.brainbook.android.itemanimator;

import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by mikepenz on 08.01.16.
 */
public class ScaleYAnimator extends BaseScaleAnimator<ScaleYAnimator> {
    public void addAnimationPrepare(@NonNull RecyclerView.ViewHolder holder) {
        ViewCompat.setScaleY(holder.itemView, 0);
    }

    public ViewPropertyAnimatorCompat addAnimation(@NonNull RecyclerView.ViewHolder holder) {
        return ViewCompat.animate(holder.itemView).scaleY(1).setDuration(getAddDuration());
    }

    public void addAnimationCleanup(@NonNull RecyclerView.ViewHolder holder) {
        ViewCompat.setScaleY(holder.itemView, 1);
    }


    public ViewPropertyAnimatorCompat removeAnimation(@NonNull RecyclerView.ViewHolder holder) {
        final ViewPropertyAnimatorCompat animation = ViewCompat.animate(holder.itemView);
        return animation.setDuration(getRemoveDuration()).scaleY(0);
    }

    public void removeAnimationCleanup(@NonNull RecyclerView.ViewHolder holder) {
        ViewCompat.setScaleY(holder.itemView, 1);
    }

    public float changeAnimationPrepare1(@NonNull RecyclerView.ViewHolder holder) {
        return ViewCompat.getScaleY(holder.itemView);
    }

    public void changeAnimationPrepare2(@NonNull RecyclerView.ViewHolder holder, float prevValue) {
        ViewCompat.setScaleY(holder.itemView, prevValue);
    }

    public void changeAnimationPrepare3(@NonNull RecyclerView.ViewHolder holder) {
        ViewCompat.setScaleY(holder.itemView, 0);
    }

    public ViewPropertyAnimatorCompat changeOldAnimation(@NonNull RecyclerView.ViewHolder holder, @NonNull ChangeInfo changeInfo) {
        return ViewCompat.animate(holder.itemView).setDuration(getChangeDuration()).scaleY(0).translationX(changeInfo.toX - changeInfo.fromX).translationY(changeInfo.toY - changeInfo.fromY);

    }

    public ViewPropertyAnimatorCompat changeNewAnimation(@NonNull RecyclerView.ViewHolder holder) {
        return ViewCompat.animate(holder.itemView).translationX(0).translationY(0).setDuration(getChangeDuration()).scaleY(1);
    }

    public void changeAnimationCleanup(@NonNull RecyclerView.ViewHolder holder) {
        ViewCompat.setScaleY(holder.itemView, 1);
    }
}
