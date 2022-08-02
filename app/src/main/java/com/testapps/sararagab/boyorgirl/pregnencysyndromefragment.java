package com.testapps.sararagab.boyorgirl;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class pregnencysyndromefragment extends Fragment {

private TextView PregnancyVomiting;
    private TextView skinProblems;
    private TextView FoodProblems;
    private TextView HeartText;
    private TextView TummyText;
    private TextView UrineTxt;
    private TextView SleepingTxt;
    private TextView HairAndBodyTxt;
    private TextView BreastTxt;
    private TextView BlackLineTxt;
    private TextView GenderPresectionTxt;
    String babygender;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.pregnancysyndromelayout, container, false);


        PregnancyVomiting = (TextView)RootView.findViewById(R.id.PregnancyVomiting);
        skinProblems = (TextView)RootView.findViewById(R.id.skinProblems);
        FoodProblems = (TextView)RootView.findViewById(R.id.FoodProblems);
        HeartText = (TextView)RootView.findViewById(R.id.HeartText);
        TummyText = (TextView)RootView.findViewById(R.id.TummyText);
        UrineTxt = (TextView)RootView.findViewById(R.id.UrineTxt);
        SleepingTxt = (TextView)RootView.findViewById(R.id.SleepingTxt);
        HairAndBodyTxt = (TextView)RootView.findViewById(R.id.HairAndBodyTxt);
        BreastTxt = (TextView)RootView.findViewById(R.id.BreastTxt);
        BlackLineTxt = (TextView)RootView.findViewById(R.id.BlackLineTxt);
        GenderPresectionTxt = (TextView)RootView.findViewById(R.id.GenderPresectionTxt);
        Bundle bundle =  this.getArguments();;
        if (bundle!= null) {

            babygender = bundle.getString("gender");
        }
        if (babygender.equals("boy")) {

            PregnancyVomiting.setText("الحمل بجنين ذكر ربما يقلل لاصابه بغثيان الصباح");
            skinProblems.setText(" الحمل بولد يعني لن يسبب ظهور حب الشباب على بشرتك، فالولد لايسرق جمال الام و لكن طبعا هذة اشياء متفاوته");
            FoodProblems.setText("فإن كنت حاملاً بولد فحتماً سترغبين بتناول الأطعمة المالحة واللاذعة");
            HeartText.setText(" أنه في حال كان نبض قلب الطفل حوالي 140 نبضة بالدقيقة يعني أنه ذكر، ");
            TummyText.setText("اذا كان ارتفاع شكل البطن لاسفل هذا يعنى ان من الممكن ان يكون الجنين ذكر");
            UrineTxt.setText("ان لون البول الغامق دليلاً على الحمل بولد،");
            SleepingTxt.setText("إن كنت تفضلين جانبك الأيسر فجنينك ذكراً.");
            HairAndBodyTxt.setText(" إن الحمل بولد يزيد من طول الشعر وبريقه ويزيد نمو شعر جسمها،");
            BreastTxt.setText(" إن المرأة التي تحمل بولد يكبر ثديها الأيمن أكثر من الأيسر");
            BlackLineTxt.setText(" فالحامل بولد يكون الخط تحت سرتها أغمق وأكثر سواداً، ");
            GenderPresectionTxt.setText("يتم تحديد جنس المولود في اليوم الأول الذي يلتقي فيه الحيوان المنوي مع البويضة، بناءً على الحيوان المنوي الذي تمكن من تلقيح البويضة، ولكن يتطور الجهاز التناسلي لطفلك في الأسبوع الحادي عشر من الحمل تقريباً.\n" +
                    "\n" +
                    "لذا لن تتمكني من معرفة جنسه قبل الأسبوع الرابع عشر من الحمل تقريبا وبعد خضوعك لفحص في جهاز الامواج فوق الصوتية.");


        }
    else if (babygender.equals("girl")){

            PregnancyVomiting.setText("وجدت أن النساء اللاتي تعانين من غثيان الصباح بشكل كبير أثناء الحمل، تكون فرص إنجابهن للإناث أكبر.");
            skinProblems.setText("ان الحمل ببنت سيقلل من جمالك، فهي تسرق هذا الجمال ");
            FoodProblems.setText("أن الحمل بفتاة يعني أنك سوف تميلين لتناول الحلويات والشوكولاتة بكثرة.");
            HeartText.setText(" أنه في حال كان نبض قلب الطفل اكثر من 140 نبضة بالدقيقة يعني أنه انثى، ");
            TummyText.setText("اذا كان ارتفاع شكل البطن لاعلى هذا يعنى ان من الممكن ان يكون الجنين انثى");
            UrineTxt.setText("ان لون البول الفاتح دليلاً على الحمل بانثى،");
            SleepingTxt.setText("إن كنت تفضلين جانبك الايمن فجنينك انثى.");
            HairAndBodyTxt.setText(" البنت سوف تتسبب في ضعف الشعر وبهتانه.");
            BreastTxt.setText(" إن المرأة التي تحمل بولد يكبر ثديها الايسر أكثر من الايمن");
            BlackLineTxt.setText(" فالحامل ببنت يكون الخط تحت سرتها خفيف ");
            GenderPresectionTxt.setText("يتم تحديد جنس المولود في اليوم الأول الذي يلتقي فيه الحيوان المنوي مع البويضة، بناءً على الحيوان المنوي الذي تمكن من تلقيح البويضة، ولكن يتطور الجهاز التناسلي لطفلك في الأسبوع الحادي عشر من الحمل تقريباً.\n" +
                    "\n" +
                    "لذا لن تتمكني من معرفة جنسه قبل الأسبوع الرابع عشر من الحمل تقريبا وبعد خضوعك لفحص في جهاز الامواج فوق الصوتية.");


        }


            return RootView;
    }
}
