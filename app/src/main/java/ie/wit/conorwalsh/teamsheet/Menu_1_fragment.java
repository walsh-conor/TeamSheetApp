package ie.wit.conorwalsh.teamsheet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Conor on 11/09/2015.
 */
public class Menu_1_fragment extends Fragment {

    View rootView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.menu_1_layout,container,false);
        return rootView;
    }
}
