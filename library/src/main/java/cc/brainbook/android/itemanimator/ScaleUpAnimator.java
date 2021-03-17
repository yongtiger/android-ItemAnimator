package cc.brainbook.android.itemanimator;

import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by mikepenz on 08.01.16.
 */
public class ScaleUpAnimator extends BaseScaleAnimator<ScaleUpAnimator> {
    public void addAnimationPrepare(@NonNull RecyclerView.ViewHolder holder) {
        ViewCompat.setScaleX(holder.itemView, 0);
        ViewCompat.setScaleY(holder.itemView, 0);
    }

    public ViewPropertyAnimatorCompat addAnimation(@NonNull RecyclerView.ViewHolder holder) {
        return ViewCompat.animate(holder.itemView).scaleX(1).scaleY(1).setDuration(getAddDuration()).setInterpolator(getInterpolator());
    }

    public void addAnimationCleanup(@NonNull RecyclerView.ViewHolder holder) {
        ViewCompat.setScaleX(holder.itemView, 1);
        ViewCompat.setScaleY(holder.itemView, 1);
    }


    public ViewPropertyAnimatorCompat removeAnimation(@NonNull RecyclerView.ViewHolder holder) {
        return ViewCompat.animate(holder.itemView).setDuration(getRemoveDuration()).scaleX(0).scaleY(0).setInterpolator(getInterpolator());
    }

    public void removeAnimationCleanup(@NonNull RecyclerView.ViewHolder holder) {
        ViewCompat.setScaleX(holder.itemView, 1);
        ViewCompat.setScaleY(holder.itemView, 1);
    }

    public float changeAnimationPrepare1(@NonNull RecyclerView.ViewHolder holder) {
        return ViewCompat.getScaleX(holder.itemView);
    }

    public void changeAnimationPrepare2(@NonNull RecyclerView.ViewHolder holder, float prevValue) {
        ViewCompat.setScaleX(holder.itemView, prevValue);
    }

    public void changeAnimationPrepare3(@NonNull RecyclerView.ViewHolder holder) {
        ViewCompat.setScaleX(holder.itemView, 0);
        ViewCompat.setScaleY(holder.itemView, 0);
    }

    public ViewPropertyAnimatorCompat changeOldAnimation(@NonNull RecyclerView.ViewHolder holder, BaseItemAnimator.ChangeInfo changeInfo) {
        return ViewCompat.animate(holder.itemView).setDuration(getChangeDuration()).scaleX(0).scaleY(0).translationX(changeInfo.toX - changeInfo.fromX).translationY(changeInfo.toY - changeInfo.fromY).setInterpolator(getInterpolator());
    }

    public ViewPropertyAnimatorCompat changeNewAnimation(@NonNull RecyclerView.ViewHolder holder) {
        return ViewCompat.animate(holder.itemView).translationX(0).translationY(0).setDuration(getChangeDuration()).scaleX(1).scaleY(1).setInterpolator(getInterpolator());
    }

    public void changeAnimationCleanup(@NonNull RecyclerView.ViewHolder holder) {
        ViewCompat.setScaleX(holder.itemView, 1);
        ViewCompat.setScaleY(holder.itemView, 1);
    }
}
