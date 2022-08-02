package com.testapps.sararagab.boyorgirl;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class fretilitydaysFragment extends Fragment {
    private TextView mtextmenstrualdatevalue;
    private TextView mtextovulation1;
    private TextView mtextovulation2;
    private TextView mtextovulation3;
    private TextView mtextgenderpregnancy;
    private Button mbuttonfertility;
    private ImageView mimagedatefertility;
    private Spinner spinner;
    private int perioddaysvalue;
    private String girlfirstvalue, girlssecondvalue, girlthirdvalue;
    private String boysfirstValue, boysSecondValue, boysThirdvalue;
    private String chosenDateValue;
    private Date chosendate;
    private Date lastdayofperiode;
    final Calendar myCalendar = Calendar.getInstance();

    String babygender;

    public fretilitydaysFragment() {
        // Required empty public constructor
    }


    public static fretilitydaysFragment newInstance(String param1, String param2) {
        fretilitydaysFragment fragment = new fretilitydaysFragment();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private void updateTextview() {
        String myFormat = "dd/MM/yy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(myFormat, Locale.US);
        mtextmenstrualdatevalue.setText(dateFormat.format(myCalendar.getTime()));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.fragment_fretilitydays, container, false);
        mtextmenstrualdatevalue = (TextView) RootView.findViewById(R.id.textmenstrualdatevalue);
        mtextovulation1 = (TextView) RootView.findViewById(R.id.textovulation1);
        mtextovulation2 = (TextView) RootView.findViewById(R.id.textovulation2);
        mtextovulation3 = (TextView) RootView.findViewById(R.id.textovulation3);
        mtextgenderpregnancy = (TextView) RootView.findViewById(R.id.textgenderpregnency);
        mbuttonfertility = (Button) RootView.findViewById(R.id.buttonfertility);
        mimagedatefertility = (ImageView) RootView.findViewById(R.id.calendarimage);
        spinner = (Spinner) RootView.findViewById(R.id.spinner);

        Bundle bundle = this.getArguments();
        if (bundle != null) {

            babygender = bundle.getString("gender");
        }
        if (babygender.equals("boy")) {
            mtextgenderpregnancy.setText("افضل اوقات العلاقه للحمل بولد");
            mtextgenderpregnancy.setBackgroundColor(getResources().getColor(R.color.babyblue));

        } else if (babygender.equals("girl")) {

            mtextgenderpregnancy.setText("افضل اوقات العلاقه للحمل ببنت");
            mtextgenderpregnancy.setBackgroundColor(getResources().getColor(R.color.babypink));
        }
        Integer[] items = new Integer[]{21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};
        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(requireActivity(), android.R.layout.simple_spinner_item, items);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                perioddaysvalue = Integer.parseInt(spinner.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, month);
                myCalendar.set(Calendar.DAY_OF_MONTH, day);
                updateTextview();
            }
        };
        mbuttonfertility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chosenDateValue = mtextmenstrualdatevalue.getText().toString();
                Log.d("chosenDateValue", "onClick: "+chosenDateValue);
                if (chosenDateValue == "") {
                    Toast.makeText(requireActivity(), "يجب اختيار التاريخ", Toast.LENGTH_LONG).show();
                } else {

                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
                    try {
                        chosendate = dateFormat.parse(chosenDateValue);
                        Date today = Calendar.getInstance().getTime();
                        String todaydate= dateFormat.format(today);
                        Date todayvalue= dateFormat.parse(todaydate);
                        //Date today = dateFormat.parse(String.valueOf(date));
                        Log.d("datetoday", "onClick: "+todaydate);
                        if (chosendate.after(todayvalue)) {
                            Toast.makeText(requireActivity(), "يجب اختيار اول يوم بالدورة السابقه", Toast.LENGTH_LONG).show();

                        } else {
                                if (babygender.equals("boy")) {
                                    Calendar cal = Calendar.getInstance();
                                    cal.setTime(chosendate);
                                    cal.add(Calendar.DATE, perioddaysvalue);
                                    Date lastperiod= cal.getTime();
                                    String mlastperiod = dateFormat.format(lastperiod);
                                    Date lastdayofperiode = dateFormat.parse(mlastperiod);

                                    cal.setTime(lastdayofperiode);
                                    cal.add(Calendar.DATE, -13);
                                    Date boyssfirst = cal.getTime();
                                    boysfirstValue = dateFormat.format(boyssfirst);
                                    Log.d("boysfirstValue", "onClick: "+boysfirstValue);
                                    mtextovulation1.setText(boysfirstValue);

                                    cal.setTime(lastdayofperiode);
                                    cal.add(Calendar.DATE, -14);
                                    Date boyssecond = cal.getTime();
                                    boysSecondValue = dateFormat.format(boyssecond);
                                    mtextovulation2.setText(boysSecondValue);

                                    cal.setTime(lastdayofperiode);
                                    cal.add(Calendar.DATE, -15);
                                    Date boyssthird = cal.getTime();
                                    boysThirdvalue = dateFormat.format(boyssthird);

                                    mtextovulation3.setText(boysThirdvalue);

                                }else if(babygender.equals("girl")){
                                    Calendar cal = Calendar.getInstance();
                                    cal.setTime(chosendate);
                                    cal.add(Calendar.DATE, perioddaysvalue);
                                    Date lastperiod= cal.getTime();
                                    String mlastperiod = dateFormat.format(lastperiod);
                                    Date lastdayofperiode = dateFormat.parse(mlastperiod);

                                    cal.setTime(lastdayofperiode);
                                    cal.add(Calendar.DATE, -12);
                                    Date girlsfirst = cal.getTime();
                                    girlfirstvalue = dateFormat.format(girlsfirst);
                                    mtextovulation1.setText(girlfirstvalue);

                                    cal.setTime(lastdayofperiode);
                                    cal.add(Calendar.DATE, -16);
                                    Date girlssecond = cal.getTime();
                                    girlssecondvalue = dateFormat.format(girlssecond);
                                    mtextovulation2.setText(girlssecondvalue);


                                    cal.setTime(lastdayofperiode);
                                    cal.add(Calendar.DATE, -17);
                                    Date girlsthird =cal.getTime();
                                    girlthirdvalue = dateFormat.format(girlsthird);
                                    mtextovulation3.setText(girlthirdvalue);


                                }

                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }


                }


            }

        });
        mimagedatefertility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(requireActivity(), date, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();

            }
        });


        return RootView;
    }
}