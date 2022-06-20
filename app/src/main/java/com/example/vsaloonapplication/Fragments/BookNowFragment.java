package com.example.vsaloonapplication.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.vsaloonapplication.R;
import com.example.vsaloonapplication.adapters.BookNowSlotsAdapter;
import com.example.vsaloonapplication.adapters.BookOtherArtistAdapter;
import com.example.vsaloonapplication.models.BookNowSlotsModel;
import com.example.vsaloonapplication.models.BookOtherArtistModel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import devs.mulham.horizontalcalendar.HorizontalCalendar;
import devs.mulham.horizontalcalendar.utils.HorizontalCalendarListener;


public class BookNowFragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_book_now, container, false);

        Calendar startDate = Calendar.getInstance();
        startDate.add(Calendar.MONTH,0);
        /* end after 1 month from now */
        Calendar endDate = Calendar.getInstance();
        endDate.add(Calendar.MONTH, 1);

        HorizontalCalendar horizontalCalendar = new HorizontalCalendar.Builder(view, R.id.calendarView_extracurricular)
                .range(startDate, endDate)
                .datesNumberOnScreen(5)
                .configure()
                .formatTopText("EEE")
                .formatMiddleText("dd")
                .formatBottomText("MMM")
                .textSize(14f, 24f, 14f)
                .showTopText(true)
                .showBottomText(true)
                .end()
                .build();
        horizontalCalendar.setCalendarListener(new HorizontalCalendarListener()
        {
            @Override
            public void onDateSelected(Calendar date, int position)
            {
                Toast.makeText(getContext(),  DateFormat.format("EEE, MMM d, yyyy", date) + " is selected!", Toast.LENGTH_SHORT).show();
            }
        });

        List<BookNowSlotsModel> bookNowSlotsModelsList = new ArrayList<>();
        bookNowSlotsModelsList.add(new BookNowSlotsModel("09:00 AM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("09:30 AM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("10:00 AM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("10:30 AM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("11:00 AM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("11:30 AM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("12:00 PM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("12:30 PM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("01:00 PM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("01:30 PM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("02:00 PM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("02:30 PM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("03:00 PM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("03:30 PM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("04:00 PM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("04:30 PM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("05:00 PM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("05:30 PM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("06:00 PM"));
        bookNowSlotsModelsList.add(new BookNowSlotsModel("06:30 PM"));

        RecyclerView recycler_view_book_now_slots = view.findViewById(R.id.recycler_view_book_now_slots);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),4);
        recycler_view_book_now_slots.setLayoutManager(gridLayoutManager);
        BookNowSlotsAdapter bookNowSlotsAdapter = new BookNowSlotsAdapter(bookNowSlotsModelsList);
        recycler_view_book_now_slots.setAdapter(bookNowSlotsAdapter);

        List<BookOtherArtistModel> bookOtherArtistModelList = new ArrayList<>();
        bookOtherArtistModelList.add(new BookOtherArtistModel(R.drawable.aaaaa));
        bookOtherArtistModelList.add(new BookOtherArtistModel(R.drawable.aaa));
        bookOtherArtistModelList.add(new BookOtherArtistModel(R.drawable.aaaaa));

        RecyclerView recycler_view_book_other_barber = view.findViewById(R.id.recycler_view_book_other_barber);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false);
        recycler_view_book_other_barber.setLayoutManager(linearLayoutManager);
        BookOtherArtistAdapter bookOtherArtistAdapter = new BookOtherArtistAdapter(bookOtherArtistModelList);
        recycler_view_book_other_barber.setAdapter(bookOtherArtistAdapter);

        return view;
    }
}
