package vn.edu.usth.dropbox.ui.home;

import android.widget.EditText;
import android.widget.ImageView;

import androidx.lifecycle.ViewModel;

import vn.edu.usth.dropbox.R;

public class HomeViewModel extends ViewModel {
    // change the icon inside the edit text
    public void changeEditTextSearchLight(EditText et) {
        et.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_search_light, 0, 0, 0);
    }
    public void changeEditTextSearchDark(EditText et) {
        et.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_search, 0, 0, 0);
    }
    public void changeImageViewStarredLight(ImageView iv) {
        iv.setImageResource(R.drawable.ic_home_starred_light);
    }
    public void changeImageViewStarredDark(ImageView iv) {
        iv.setImageResource(R.drawable.ic_home_starred);
    }
    public void changeImageViewViewedLinksLight(ImageView iv) {
        iv.setImageResource(R.drawable.ic_home_viewed_links_light);
    }
    public void changeImageViewViewedLinksDark(ImageView iv) {
        iv.setImageResource(R.drawable.ic_home_viewed_links);
    }

    public void changeImageViewSharedLight(ImageView iv) {
        iv.setImageResource(R.drawable.ic_home_shared_light);
    }
    public void changeImageViewSharedDark(ImageView iv) {
        iv.setImageResource(R.drawable.ic_home_shared);
    }

    public void changeImageViewOfflineLight(ImageView iv) {
        iv.setImageResource(R.drawable.ic_home_offline_light);
    }
    public void changeImageViewOfflineDark(ImageView iv) {
        iv.setImageResource(R.drawable.ic_home_offline);
    }

    public void changeImageStarredDark(ImageView iv) {
        iv.setImageResource(R.drawable.img_home_starred);
    }

    public void changeImageStarredLight(ImageView iv) {
        iv.setImageResource(R.drawable.img_home_starred_dark);
    }

    public void changeImageLinksDark(ImageView iv) {
        iv.setImageResource(R.drawable.img_home_link);
    }

    public void changeImageLinksLight(ImageView iv) {
        iv.setImageResource(R.drawable.img_home_link_dark);
    }

    public void changeImageSharedDark(ImageView iv) {
        iv.setImageResource(R.drawable.img_home_shared);
    }

    public void changeImageSharedLight(ImageView iv) {
        iv.setImageResource(R.drawable.img_home_shared_dark);
    }

    public void changeImageOfflineDark(ImageView iv) {
        iv.setImageResource(R.drawable.img_home_offline);
    }

    public void changeImageOfflineLight(ImageView iv) {
        iv.setImageResource(R.drawable.img_home_offline_dark);
    }

}
