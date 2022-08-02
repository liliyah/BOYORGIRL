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

public class ovulationfragment extends Fragment {
    @Nullable

    private TextView mOvulationTxt;
    private  TextView mWashText;
    String babygender;
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.ovulationlayout, container, false);
        mOvulationTxt = (TextView)RootView.findViewById(R.id.ovulationText);
        mWashText = (TextView)RootView.findViewById(R.id.wash);

  Bundle bundle = this.getArguments();;
if (bundle!= null){

     babygender = bundle.getString("gender");
     if ((babygender.equals("boy"))){

         mOvulationTxt.setText("لكى تزداد احتمالات إنجاب ولد إذا اتبعتِ النصائح الآتية:" +
                 "1- تحديد موعد التبويض بدقة، ويمكنك حساب يوم التبويض حسب موعد الدورة الشهرية من كل شهر" +
                 "، ويكون موعد التبويض أكثر دقة إذا كانت دورتك منتظمة، حيث تكون أيام التبويض عادة في اليوم 14 و15 و16 من الدورة الشهرية.    " +
                 " 2-التوقف عن ممارسة العلاقة الزوجية لمدة أسبوع قبل التبويض، لضمان وجود مخزون مرتفع من الحيوانات المنوية" +
                 " وحتى تصبح أقوى وأسرع. عند معرفة موعد التبويض،" +
                 " 3- ينصح بممارسة العلاقة الزوجية في يوم التبويض نفسه بحيث عندما تخرج البويضة تستقبلها الحيوانات المنوية الذكرية،" +
                         " لأن الحيوانات المنوية الذكرية أسرع من الأنثوية، ولكنها لا تعيش طويلًا إذا ظلت مدة طويلة في الرحم، بالإضافة إلى أن " +
                         "السوائل الموجودة في رحم المرأة تكون ذات سماكة خفيفة، ما يتيح للحيوانات المنوية الذكورية" +
                         " السباحة فيها بشكل أسرع  4- ممارسة العلاقة الزوجية خلال فترة الليل.5-اختيار وضع عميق يتيح فتح قناة فالوب للحيوانات المنوية ووصولها لأبعد مسافة عند القذف، لإتاحة الفرصة للحيوانات المنوية الذكرية الوصول أسرع من الأنثوية للبويضة.6- يفضل عدم الاستحمام مباشرة بعد العلاقة وبقاء المرأة نائمة في الفراش حتى الصباح، لكي تبقى الحيوانات المنوية أطول فترة ممكنة " +
                         ".7- يفضل أيضًا إيصال المرأة إلى مرحلة النشوة، لكي يفرز جسمها مادة تجعل المهبل قلويًا، " +
                         "لأن الوسط القلوي يعتبر بيئة ممتازة للحيوانات المنوية الذكورية.\n"
                 );
         assert mOvulationTxt != null;
         mOvulationTxt.setTextDirection(View.TEXT_DIRECTION_ANY_RTL);

         mWashText.setText("عمل تشطيف مهبلى قلوى ..\n" +
                 "مثل : بيدالكين أو فاجيل بودر تشطيف بماء دافئ 3 مرات يوميا\n" +
                 "لان ذلك له تأثير قوى جداً على الحيوانات المنوية ويكون قبل الجماع" +
                 " أو قبل نزول البويضة بثلاثة أيام ويكون التشطيف " +
                 "داخل الرحم فيجب شراء غسول قلوى مهبلى من الصيداليه واستعماله داخل الرحم فيوجد نوع جيد يحتوى على بيكنج صودا تستطيع فيه تطهير المهبل من داخله طريقة استعماله جيدة " +
                 "ومحكمة يمكن بها من الوصول داخل الرحم وتحويله إلى قلوى لانه طبيعيا يكون حمضى وللتأكيد أكثر يجب ..تناول فوار ضد الحموضة ." +
                 ".لمدة ثلاث أيام قبل نزول البويضة ويجب التخلص من الالتهابات المهبلية قبل التفكير أصلا فى الخوض بهذه التجربه عموما وان يكون الزوج أيضاً غير مصاب بدوالى الخصية فيجب أن يفضل التشطيف بماء بارد لان ذلك ينشط الحيوانات المنوية الذكرية عند الزوج ويفضل شراب القهوة للزوج قبل الجماع مباشرة");
         assert mWashText != null;
         mWashText.setTextDirection(View.TEXT_DIRECTION_ANY_RTL);


     }else if ((babygender.equals("girl"))){

mOvulationTxt.setText("إنّ الحيوان المنوي الأنثوي يعيش لفترة أطول داخل الرَّحم" +
        " كما أنَّ حركته أبطأ من الحيوان المنوي الذكري، لذا يجب عليكِ معرفة أيام الإباضة بدقة وتحديد يوم التبويض، " +
        "ومن الأفضل أن يحدث الجماع قبل يوم التبويض بفترة بسيطة حيث تعيش الحيوانات المنوية عدّة أيام داخل الرّحم يموت فيها " +
        "أولًا الحيوانات المنوية الذكورية وتبقى الأنثوية و ايضا لابتعاد عن هزة الجماع، إذ يؤدي ذلك إلى بقاء البيئة الحامضية مرتفعة، وبالتالي التخلص من الخلايا الذكرية\n");

         assert mOvulationTxt != null;
         mOvulationTxt.setTextDirection(View.TEXT_DIRECTION_ANY_RTL);
mWashText.setText("الوسط الحامضيِ من أكثر العوامل الملائمة للحيوان المنوي الأنثوي ....استخدام دش مهبلي قلوي قبل الجماع بحوالي 15 دقيقة، و ذلك بأن نضع ملعقة كبيرة من الخل الأبيض الحمضي على لتر ماء مغلي فاتر، ثم إجراء عملية غسيل عميق للمهبل بواسطة هذا المحلول.\n" +
        "ومن تجارب امهات البنات \n" +
        "استخدام تحاميل البوثيل من يوم الطهر ايضا ينبغي أن يكون الإيلاج ( الجماع) سطحياً و الوضع المناسب لذلك هو الوضع التقليدي ( أي اعتلاء الزوج لزوجته) وبذلك يضع الزوج المني بعيداً عن فتحة عنق الرحم حيث يكون الوسط حامضي و غير ملائم للخلايا الذكرية فتموت تاركة الخلايا الأنثوية التي تخصب البويضة. ");
         assert mWashText != null;
         mWashText.setTextDirection(View.TEXT_DIRECTION_ANY_RTL);
}
}
        return RootView;
    }

}
