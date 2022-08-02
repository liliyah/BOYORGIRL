package com.testapps.sararagab.boyorgirl;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.testapps.sararagab.boyorgirl.adapter.babynamesAdapter;
import com.testapps.sararagab.dataclass.babynames;


public class BabyNamesFragment extends Fragment {
    String babygender;
    babynamesAdapter adapter;
    private babynames[] girlslist = new babynames[]{
            new babynames("ميلا", "مشتق من كلمة “ميلاء” وهي الشجرة الكبيرة."),
            new babynames("روان", "معناه في اللغة الفارسية الروح."),
            new babynames("رماس", "نوع من انواع الالماس يتميز باللون الاسود البراق"),
            new babynames("جوري", "أحد أنواع الورد ويتميز برائحته الطيبة والذكية"),
            new babynames("ريناد", "الرائحة الذكية العطرة, ايضا هو اسم البخور المخصص للكعبة."),
            new babynames("جود", "كرم وعطاء"),
            new babynames("لارا", "النجمة التي تضئ في السماء."),
            new babynames("تولين", "ضوء القمر."),
            new babynames("ليليا", "نوع من انواع الزهور"),
            new babynames("اسيل", "املس وناعم او الشئ اللين."),
            new babynames("تيا", "الاميرة والفتاة الرقيقة وأصله يوناني."),
            new babynames("روفان", "وردة تركية الاصل, واسم الحمام الذي يطوف حول الكعبة, والسكون والرحمة"),
            new babynames("لوسيندا", "صاحبة الوجه الحسن أو المضئ."),
            new babynames("كايلاا", "الفتاة الجميلة والرشيقة, وفي الاصول الافريقية معناه التاج"),
            new babynames("سيرين", "الزهرة والوردة, وله معنى اخر وهي قمة الجبل."),
            new babynames("ميرا", "الرائعة, وهو ايضا مشتق من اسم مريم."),
            new babynames("نايا", "ابنة الظبي, ومأخوذ ايضا من آلة الناي وتتميز بالصوت الناعم."),
            new babynames("ليليان", "معناه في العربية الخمر الذي يُسكر وهو مأخوذ من ليلي, وفي الانجليزية يرمز الى زهرة السوسن."),
            new babynames("ريتال", "ومعناه الفتاة التي تجيد القرآن الكريم، والفتاة حسنة الكلام."),
            new babynames("مايا", "يطلق هذا الاسم على أحد شعوب الهنود الحمر، كما أنه كان يتسمى به آلهة الربيع عند الرومان"),
            new babynames("توبا", "وهذا الاسم معناه المرأة النقية والمجتهدة، كما يطلق هذا الاسم على شجرة في الجنة."),
            new babynames("روفان", "وردة تركية أو يطلق على الحمام الذي يطوف حول الكعبة."),
            new babynames("نيلان", "وهي المرأة القادرة على تحقيق أحلامها وأهدافها والمُصرة على قرارتها"),
            new babynames("سجى", "ومعناه الليل وسكونه، والظلمة الشديدة."),
            new babynames("سلسبيل", "نهر في الجنة."),
            new babynames("دانية", "قريبة"),
            new babynames("ترف", "رغد العيش"),
            new babynames("أفنان", "اسمه يدل على اللطف والسمو "),
            new babynames("تمارة", "ويعني هذا الاسم بائعة التمر"),
            new babynames("جوان", "ويطلق على أحد الأنهار الموجودة في الجنة."),
            new babynames("ديمة", "ومعناه المطر الهاديء الساكن الذي لا يكون مصحوبًا بالرعد والبرق."),
            new babynames("تارا", "وهو النجمة التي تتألق في السماء"),
            new babynames("ناتالي", "اسم مأخوذ من اللغة اللاتينية ويعني الجميلة "),
            new babynames("ماري", " ومعناه المرأة أو السيدة"),
            new babynames("جولى", "تعنى الجميله باللغه الفرنسيه"),
            new babynames("لارين", "تعنى الاميرة باللغه الفرنسيه"),
            new babynames("رواء", " الفتاة ذات المظهر الحسن "),
            new babynames("دارين", "إسم منطقة في البحرين ينسب لها مسك دارين"),
            new babynames("دانة", "الجوهرة أو اللؤلؤة الكبيرة"),
            new babynames("ميسم", "العضو المؤنث في الزهرة – من بدا عليها أثر الحسن والجمال."),
            new babynames("لينة", "النخلة الصغيرة."),
            new babynames("نهاود ", "مدينه ايرانيه"),
            new babynames("ناردين", "نبات طيب الرائحه ,,يستعمل للزينه."),
            new babynames("جالا", "اسم مأخوذ من اللغة الفارسية ويعني المنطقة المرتفعة"),
            new babynames("أزهار", "وهي  عبارة عن برعم النبات."),
            new babynames("هيا", "محبوبه .. تحب اللي يحبها بس"),
            new babynames("يسرى ", "شخصيه قويه .. تحب تثبت ذاتها ."),
            new babynames("بنانة ", "يعني الروضة التي بها الكثير من الخضرة"),
            new babynames("تاليه", "تعنى تاليه القران"),
            new babynames("أرام", "هذا الاسم يعني الظباء."),
            new babynames("مياس", "وهي المرأة كثيرة التبختر في سيرها."),
            new babynames("هنادة", "وهو اسم نسبة إلى هند."),
            new babynames("هنادي", "ويعني الفتاة الجميلة الرقيقة."),
            new babynames("هنا", "هو اسم يعني السعادة والفرح."),
            new babynames("هيفاء", "ويعني نحافة الخصر وهو علامة من علامات جمال المرأة."),
            new babynames("هدير", "ويعني صوت الحمام وغليان الماء."),
            new babynames("هدباء", "وهي المرأة التي طال هدب عينيها."),
            new babynames("لمي", "وهو اسم يعني اسمرار الشفاه مما يجعلها جذابة الشكل."),
            new babynames("ميار", "ومعناه الضوء الذي يوجد على القمر"),
            new babynames("لمار", "وهذا الاسم يعني بريق الماس والذهب."),
            new babynames("كادي", "هو اسم من أسماء الزهور."),
            new babynames("مارية", "ويعني هذا الاسم المرأة البيضاء."),
            new babynames("ريانة", "وهذا الاسم يعني المرأة التي ارتوت بالماء بعد العطش"),
            new babynames("روانا", "هو اسم فارسي الأصل يعني السفر."),
            new babynames("جوانا", "وهو اسم فارسي يعني الفتاة الصغيرة."),
            new babynames("جيلان", "هو اسم مشتق من كلمة جيل ويعني الناس"),
            new babynames("راوند", "وهو اسم يعني الحبل الذي يُعلق عليه العنب."),
            new babynames("ديالا", "وهذا الاسم معناه منسوب نهر يوجد بدولة العراق."),
            new babynames("رنيم", "وهو اسم يعني الأنشودة عذبة اللحن."),
            new babynames("تاله", "وهذا الاسم يعني النخلة الصغيرة."),
            new babynames("رانسي", "هذا الاسم من أسماء الأنهار."),
            new babynames("أزرا", "وهي الفتاة الطاهرة"),
            new babynames("نيجار", "ومعناه النيران."),
            new babynames("إلين", "اسم يطلق على الفتاة الرقيقة ذات الطبع اللين."),
            new babynames("ريما", "معناه الغزال ذو اللون الأبيض الناصع."),
            new babynames("أسيل ", "اسم يطلق على الفتاة الناعمة."),
            new babynames("ريمان", "هو مثنى اسم ريم وهو الظبي الصغير."),
            new babynames("لوليا", "اسم مقتبس من كلمة لؤلؤ."),
            new babynames("ليما", "يطلق هذا الاسم على الفتاة التي تسعي لنشر المحبة والإصلاح بين المتخاصمين"),
            new babynames("لاما", " اسم حيوان يشبه الغزال."),
            new babynames("لمار", "يطلق هذا الاسم على الفتاة ذات العقل الراجح والحكمة."),
            new babynames("رزان", "نوع من انواع الالماس يتميز باللون الاسود البراق"),
            new babynames("ريتاج", "اسم يطلق على باب الكعبة المشرفة."),
            new babynames("جوليا ", "اسم يطلق على الفتاة المفعمة بالطاقة."),
            new babynames("جال", " اسم ذو أصل فارسي ويطلق على الفتاة ذات المكانة المرتفعة"),
            new babynames("روان", " يطلق هذا الاسم على الفتاة المحبة للسفر."),
            new babynames("جوان", "معناه الفتاة ذات الخدود الوردية."),
            new babynames("هايدي ", "يطلق على الفتاة ذات الأصل النبيل وهو اسم ذو أصول ألمانية."),
            new babynames("لور", "اسم ذو أصل فارسي زمعناه هضبه."),
            new babynames("لورين", " اسم ذو أصل لاتيني ومعناه متوجة بالغار."),
            new babynames("لميس", "اسم ذو أصول عربية ومقتبس من اللمس"),
            new babynames("سلسبيل", "اسم أحد أنهار الجنة ويرمز للفتاة السلسة في تعاملاتها مع الآخرين"),
            new babynames("سديم", "معناه الضباب الخفيف"),
            new babynames("سدرة", " اسم مأخوذ من سدرة المنتهى وهي شجرة"),
            new babynames("تسنيم", "اسم منبع ماء الجنة."),
            new babynames("رفيدة", "كانت تقوم السيدة رفيدة بتضميد جراح المصابين في الغزوات."),
            new babynames("رنيم", "معناه الطرب والغناء الجميل، أو الصوت الجميل، التلاوة الحسنة."),
            new babynames("رنين", "معناه الصوت الحزين عند البكاء أو الغناء، الصوت الشجي"),
            new babynames("رهف", "اسم يرمز للرقة واللطافة ويطلق على الفتاة حسنة الطباع."),
            new babynames("سجود", " معناه وضع الجبهة على الأرض والاستسلام لله."),
            new babynames("سالمين", "نعنى السلامه و هى الفتاة السليمه النقيه"),
            new babynames("ليالِ", "جمع ليل"),
            new babynames("هنزادا", "اسم تركى معناة سيدة القصر"),
            new babynames("ارزو", "اسممن اصل عربى يعنى السلام"),
            new babynames("رينا", "الطاهرة النقيه باليونانيه"),
            new babynames("ايلار", "تعنى الشخصيه المرحه"),
            new babynames("ايلا", "تعنى الضوء الى حول القمر"),
            new babynames("مسك", "نوع من انواع البخور"),
            new babynames("كارمن", "معناة الاغنيه المحبوبه"),
            new babynames("بيريهان", "الحسناء الملائكيه"),
            new babynames("ايلين", "معناة اجمل نساء العالم"),
            new babynames("كارن", "معناة الطاهرة النقيه"),
            new babynames("لاميتا", "الشى الذى لانهايه له"),
            new babynames("اسيه", "اسم قارة "),
            new babynames("دليله", "كثيرة الدلال "),
            new babynames("سيليا", "اسم لاتينى يعنى الجنه "),
            new babynames("رغد", "العيش الطيب "),
            new babynames("ترتيل", "التى ترتل القران "),
            new babynames("كنزى", "الاميرة او الزهرة بالفارسى "),
            new babynames("روهان", "صاحبه الشعر الاحمر "),
            new babynames("نوراى", "القمر المضى "),
            new babynames("غاليه", "الغاليه القيمه"),
            new babynames("بيرلا", "اللؤلؤ بالاسبانى"),
            new babynames("جويريه", "تصغير جاريه"),
            new babynames("بيسان", "المنزل المسكون"),
            new babynames("صبا", "ريح الصبا"),
            new babynames("ماسه", "الحجر الثمين"),
            new babynames("غرام", "الحب الشديد"),
            new babynames("كارلا", "المراة صغيرة الحجم"),
            new babynames("سوفانا", "صحابيه جليله"),
            new babynames("ليمار", "بريق الذهب"),
            new babynames("شادن", "معناه الغزال الصغير الجميل."),

    };
    private babynames[] boyslist = new babynames[]{
            new babynames("يعقوب ", " اسم لنبي الله يعقوب"),
            new babynames("يونس ", " اسم لنبي الله يونس صاحب الحوت ويلقب ذا النون."),
            new babynames("يامن ", " اليمن والبركة"),
            new babynames("يافع ", "سام عال المقارب للبلوغ من الفتيان"),
            new babynames("يزيد ", "يزداد خيرا وبركة ونماء وكثرة الزائد الأكثر يقال اشتراه بدرهم فاكثر و يزيد أيضاً : الزيادة والنماء"),
            new babynames("ياسين ", "فهو لفظ قرآني مبارك"),
            new babynames("وسيم ", " فيه أثر الحسن والجمال والأصل"),
            new babynames("هادي ", "من يهدي غيره الى الخير"),
            new babynames("هاشم ", "الهاشم الجبل الرخو والحلاب الحاذق"),
            new babynames("نائل ", " من ينال مبتغاه."),
            new babynames("نضال ", "محاماة ودفاع ومباراة في الرمي"),
            new babynames("نزار ", " اشتقاقه من النزر وهو القليل"),
            new babynames("نواف ", "المرتفع العالي"),
            new babynames("نايف ", "المرتفع العالي"),
            new babynames("منذر ", "من الإنذار وقد سمت العرب منذرا ونذيرا ومنذرة والنذير والإنذار والمنذر"),
            new babynames("معاذ", "محصن باسم الله"),
            new babynames("مؤيد ", "الذي يؤيد الغير"),
            new babynames("مهند ", "اسم السيف المصنوع من الحديد الهندي."),
            new babynames("مشاري ", "خليه النحل"),
            new babynames("مصعب ", "مصعب من الفحل"),
            new babynames("مراد ", "سمت العرب مرادا لأنه أول من تمرد باليمن والمراد المقصور المحبوب المطلوب."),
            new babynames("ليث ", " من اسماء الاسد."),
            new babynames("كاظم ", "الذي يصبر ويحبس غيظة."),
            new babynames("قيس ", " القوة والشدة."),
            new babynames("فيصل ", " الفيصل الحاكم "),
            new babynames("فهد ", "سبع"),
            new babynames("فراس ", "أبو فراس كنية الأسد"),
            new babynames("عمار  ", "وتعني الحليم "),
            new babynames("عدي  ", "نسبة الى قبيلة عدي وهي مصدر من كلمة عداء أو عدو"),
            new babynames("عابد ", " فاعل من العبادة وهي الطاعة والانقياد والخضوع والذل لله، "),
            new babynames("ظافر ", "الفائز المنتصر"),
            new babynames("طلال ", "مطل من عليائه على مَنْ هم دونه، والطل: الحسن المعجب،"),
            new babynames("صُهَيْب ", " تصغير أصهب، والصهبة من ألوان الإبل "),
            new babynames("شريف ", " العلو والنزاهه"),
            new babynames("شاهين ", "نوع من الصقور"),
            new babynames("ساري ", "السحاب الذي يظهر ليلاً"),
            new babynames("سهيل ", " نجم في السماء من النجوم اليمانية"),
            new babynames("سلام ", "سلام: فهو إما كثير السلام على من يلقاه"),
            new babynames("سفيان ", "اشتقاقه من السافي، وهو ما سفته الريح من تراب "),
            new babynames("زيد ", "العطاء والنماء"),
            new babynames("زاهر ", "حسن اللون والشيء الزاهر: المضيء"),
            new babynames("راني ", "طموح"),
            new babynames("رامز ", "رمز للشئ المشير اليه."),
            new babynames("راجي ", " الامل وعدم اليأس"),
            new babynames("ريان ", "ممتلئ فيه نضارة وحيوية وشبع"),
            new babynames("ذاكر ", " الفطن الذي لاينسئ"),
            new babynames("خالد  ", "الخلود يعني طول العمر."),
            new babynames("حارس  ", "الذي يرتبط بحفظ السلطان"),
            new babynames("ثابت ", "دائم مستقيم لا يتغير"),
            new babynames("بلال ", " البلال هو الماء."),
            new babynames("بدر", "البدر هو اكتمال القمر."),
            new babynames("أوس ", "كلمة قبطية بمعنى الذئب."),
            new babynames("أنس ", "مصدر أنس لمن يعايشه."),
            new babynames("الياس ", "معنى المنقطع للعبادة والحذق الفطن"),
            new babynames("أيهم ", "من أسماء الأسد"),
            new babynames("أديب", "الاخذ بمحاسن الاخلاق."),
            new babynames("جوليان ", "الشاب"),
            new babynames("ستيفاني ", " ولي العهد(خليفة)"),
            new babynames("دانيال ", "حاكم العالم"),
            new babynames("ميسي ", "ثمين."),
            new babynames("هارون ", "المستنير."),
            new babynames("سادن", ": خادم الكعبة المشرفة."),
            new babynames("إبان", "معناه الواضح الظاهر"),
            new babynames("ركان", "ويرمز هذا الاسم إلى صفات الثبات،."),
            new babynames("داغر", "اسم عربي الأصل معناه الدافع والمهاجم."),
            new babynames("راسل", "معناه الشخص الطويل."),
            new babynames("بارق", "معناه البراق اللامع.."),
            new babynames("على", "من العلو و السمو."),
            new babynames("معتصم بالله", "ويعني المحتمي ، الممتنع عن المعصية."),
            new babynames("مالك", "صاحب المُلك ، الرسالة ، الذي يحبس نفسه عن رغباتها"),
            new babynames("نعمان", "وهو نبات أحمر الزهر كثير الانتشار في الحقول "),
            new babynames("طارق", "ويعني كوكب الصبح، أو من يأتي ليلاً"),
            new babynames("عمر", "سم ينطق بضم الواو “عمر”، وهو اسم الصحابي عمر بن الخطاب أحد الخلفاء الراشدين."),
            new babynames("زيد", "هناك أكثر من صحابي يحملون اسم زيد، مثل زيد بن ثابت."),
            new babynames("تمّام", "الكمال ، المولود بتمام الخَلق ، ليلة التَّمام."),
            new babynames("سهيل ", "هو اسم الصحابي سهيل بن عمرو، وهو من وجهاء مكة."),
            new babynames("منذر", "اسم يعني الرسول ،أو النذير"),
            new babynames("زين", "اسم ولد يعني حسن وجمال."),
            new babynames("راكان", "اسم عربي يعني الثبات والوقار"),
            new babynames("دياب", "اسم أولاد عربي وهو جمع كلمة ذئب."),
            new babynames("تيّم", "أصل الاسم عربي ويعني الهوى الشديد لشيء."),
            new babynames("أسير", "من أسماء الأولاد العربية المتميزة ويعني من يتم أسره أو أسير الحرب."),
            new babynames("آسر", "اسم عربي الأصل مشتق من فعل أسر وهو يعني الشجاعة ."),
            new babynames("بيجاد ", "منسوب للصحراء ومعناه المرشد أو الدليل."),
            new babynames("براء", "  برأ أي شفى من الأسقام أو نجا من التهم."),
            new babynames("فاروق", " سم عربي من الفعل فرق ومعناه الذي يفرق بين الحق والباطل ."),
            new babynames("سليم", " سلم أي نجا وأمن."),
            new babynames("ساجد ", "خضع وتذلل لربه.."),
            new babynames("ّاّمن", "الشخص الامن المؤمن."),
            new babynames("ران", "مذكور بالقران ران على قلوبهم"),
            new babynames("زيدان", "ومعناه النمو والكثرة."),
            new babynames("رائف", "اسم مشتق من الفعل رأف أي تأخذه الشفقة والرحمة بالآخرين"),
            new babynames("رفيق", "عني من يعامل الناس بلطف وهو ما يعني الصديق أو رقيق المعاملة."),
            new babynames("حَسَن", "اسم عربي من الحسن"),
            new babynames("حليم", "معناه المتأني عند الغضب والذي يعفو ويصفح عند المقدرة."),
            new babynames("حاكم", "معناه الذي يتولى منصب ولي الأمر وهو الشخص الذي يحسن الأشياء الدقيقة."),
            new babynames("مولاى", "معناه صاحب المولى و السمو."),
            new babynames("جاسر", "هو مشتق من الجسور أي الشجاع "),
            new babynames("بيجاد", "منسوب للصحراء ومعناه المرشد أو الدليل."),
            new babynames("حارم", "  اسم عربي مشتق من الحرم ومعناه الشخص الذي يمنع غيره."),
            new babynames("رائد", "مشتق من الفعل راد أي أدار وقاد."),
            new babynames("رائف", "أي تأخذه الشفقة والرحمة بالآخرين"),
            new babynames("ادم", " اسم اول رجل على وجه الارض ."),
            new babynames("عبد الرحمن", " عابد الرحمن وهو الله ."),
            new babynames("كنان", "من الفعل كن اى ستر و غطى."),
            new babynames("رحيم", "من الفعل رحم اى الذى فى قلبه رحمه."),
            new babynames("كرم", "من الكرم و العطاء."),
            new babynames("يمان", "الشخص المبروك."),
            new babynames("يزن", "من العدل و المساواه."),
            new babynames("فرقان", "كلمه باالقران الكريم "),
            new babynames("سند", "يتصف بالسند و العون "),
            new babynames("ميسرة", " اسم خادم نبي الله ."),
            new babynames("كيفانش", " اسم تركى يعنى الفخر و الكبرياء ."),
            new babynames("صالح", " اسم نبي الله صالح عليه السلام ."),
            new babynames("سام", " اسم ابن سيدنا نوح ."),
            new babynames("سمو", " من يتسم بالسمو و الرفعه."),
            new babynames("هود", "اسم نبى الله هود"),
            new babynames("مهيمن", "اسم من اسماء الله"),


    };
    public BabyNamesFragment() {
        // Required empty public constructor
    }


    public static BabyNamesFragment newInstance(String param1, String param2) {
        BabyNamesFragment fragment = new BabyNamesFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.fragment_baby_names, container, false);
        RecyclerView recyclerView = (RecyclerView)RootView.findViewById(R.id.recyclername);

        Bundle bundle = this.getArguments();;
        if (bundle!= null) {

            babygender = bundle.getString("gender");
        }
        if (babygender.equals("boy")){
            adapter = new babynamesAdapter(boyslist);

        }else if (babygender.equals("girl")){

            adapter = new babynamesAdapter(girlslist);
        }
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        recyclerView.setAdapter(adapter);
        return RootView;
    }
}