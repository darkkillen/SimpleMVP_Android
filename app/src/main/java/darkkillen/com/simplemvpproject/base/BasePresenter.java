package darkkillen.com.simplemvpproject.base;

/**
 * Created by darkkillen on 8/18/2016 AD.
 */

public interface BasePresenter {

    void viewOnCreate();

    void viewOnStart();

    void viewOnResume();

    void viewOnPause();

    void viewOnStop();

    void viewOnDestroy();

    void viewOnCreateView();

    void viewOnDestroyView();
}
