package com.testapps.sararagab.boyorgirl;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class genderfragment extends Fragment {
    private TextView gendertype;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.genderlayout, container, false);
        gendertype = (TextView)RootView.findViewById(R.id.gendertype);
        gendertype.setText("يُنتج الرجل ملايين الحيوانات المنوية التي تبدأ رحلتها ليصل الأسرع منها إلى البويضة أولًا لتلقيحها ويحدث الحمل، وتحمل الحيوانات المنوية للرجل نوعين من الكروموسومات (X للإناث وY للذكور)، أما البويضة فتحمل نوعًا واحدًا من الكروموسومات وهو الكروموسوم (X للإناث). من يصل أولًا هو من يُحدد جنس المولود، إذا وصل الحيوان المنوي الذي يحمل الكروموسوم \"Y\" أولًا إلى البويضة وتم التلقيح يكون الجنين ذكرًا، أما إذا وصل الكروموسوم \"X\" أولًا إلى البويضة ونجحت عملية التلقيح يكون الجنين أنثى، لذلك أقر العلماء أن تحديد نوع الجنين يحدث قبل الحمل بمجرد اجتماع الحيوان المنوي الأسرع مع البويضة" );
        assert gendertype != null;
        gendertype.setTextDirection(View.TEXT_DIRECTION_ANY_RTL);
        return RootView;
    }
}


