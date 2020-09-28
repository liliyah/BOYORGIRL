package com.testapps.sararagab.boyorgirl;

import android.annotation.TargetApi;
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

public class dietfargment extends Fragment {
private TextView mTextDiet;
private  TextView mContentTextDiet;
    String babygender;
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.dietlayout, container, false);
        mTextDiet = (TextView)RootView.findViewById(R.id.dietText);
        mContentTextDiet = (TextView)RootView.findViewById(R.id.contentdietText);
        Bundle bundle = this.getArguments();
        if (bundle!= null) {

            babygender = bundle.getString("gender");

            if (babygender.equals("boy") ){
                mTextDiet.setText("نظام غذائى خاص للحمل بولد");
                assert mContentTextDiet != null;
                mContentTextDiet.setTextDirection(View.TEXT_DIRECTION_ANY_RTL);

                mContentTextDiet.setText("إذا أردت سيدتي أن تنحصر اختيارات لمستلزمات طفلك القادم باللون الأزرق؛ هذا يعني بأنك تريدين أن تضعين مولوداً ذكراً ومن هنا عليك التركيز على طبيعة غذاءك الذي تتناوليه ليكون أكثر قلوية؛ أي يتوجب عليك تناول الأغذية القلوية قبل شهر واحد على الأقل من حدوث الحمل والاستمرار بذلك أثناء فترة الحمل.وهذه الأغذية تشتمل على:\n" +
                        "\n" +
                        "الحبوب والحبوب الكاملة\n" +
                        "الأطعمة التي تحتوي على البوتاسيوم كالتمر والموز\n" +
                        "الملح\n" +
                        "القهوة\n" +
                        "المشروبات الغازية\n" +
                        "كافة أنواع اللحوم واللحوم الجافة والأسماك المملّحة\n" +
                        "فيما يتوجب عليك الابتعاد عن تناول الحليب والمخبوزات التي يدخل الحليب في مكوناتها واللبن الزبادي، بالإضافة إلى الجبن والزبدة غير المملحة والأطعمة التي يكثر بها الصوديوم. كما عليك البقاء ضمن إطار التوجيهات الغذائية السليمة التي يوصيك بها الطبيب.");
                assert mContentTextDiet != null;
                mContentTextDiet.setTextDirection(View.TEXT_DIRECTION_ANY_RTL);

            }
            else if (babygender.equals("girl")){
                mTextDiet.setText("نظام غذائى خاص للحمل ببنت");
                assert mContentTextDiet != null;
                mContentTextDiet.setTextDirection(View.TEXT_DIRECTION_ANY_RTL);

mContentTextDiet.setText(" إذا أردت سيدتي أن تحصري اختياراتك لمستلزمات طفلك القادم بالألوان الوردية، فممّا لا شك فيه أنت ترغبين بأن تكون فتاة؛ لذلك ينصحك الأطباء بالتركيز على الأطعمة التي تزيد من الحموضة في الجسم أهمّها:\n" +
        "\n" +
        "الحليب والقشطة\n" +
        "الزبدة غير المملحة\n" +
        "الفراولة\n" +
        "البصل\n" +
        "الثوم\n" +
        "الخردل\n" +
        "الكمثرى\n" +
        "اللبن الزبادي\n" +
        "الجبن\n" +
        "الجرجير\n" +
        "الليمون\n" +
        "القرنبيط\n" +
        "الجريب فروت\n" +
        "التفاح\n" +
        "زبدة الفول السوداني\n" +
        "البامية\n" +
        "سلطة سيزر\n" +
        "سمك السلمون\n" +
        "اللحوم الحمراء\n" +
        "على عكس ذلك عليك تجنّب تناول الملح والخميرة والدجاج والسمك المالح والطماطم والقهوة، والمشروبات الغازية قبل شهر واحد من حدوث الحمل على أقل تقدير والاستمرار بذلك طيلة فترة الحمل، مع ضرورة التأكد من تناول مجموعة متنوعة من الأغذية الغنية بالفيتامينات والمواد المغذية لك ولجنينك بعد ذلك.");

                assert mContentTextDiet != null;
                mContentTextDiet.setTextDirection(View.TEXT_DIRECTION_ANY_RTL);
            }

        }

        return RootView;
    }
}
