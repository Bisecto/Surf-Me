package com.example.surfme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomePage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomePage extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomePage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomePage.
     */
    // TODO: Rename and change types and number of parameters
    public static HomePage newInstance(String param1, String param2) {
        HomePage fragment = new HomePage();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_page,container,false);
        TextView text= view.findViewById(R.id.alpha);

        String[] arr= {"Over 3.8 billion people use the internet today, which is 40% of the world’s population",
        "8 billion devices will be connected to the internet by 2021.",
        "More than 570 new websites are created every minute.",
        "There are over 3.5 billion searches per day on Google.",
        "Every minute 24 hours of video is uploaded to YouTube. More video content is uploaded to YouTube in a 60-day period than the three major U.S. television networks created in 60 years.",
                "By 2021, video will account for about 80% of all internet traffic.",
        "340,000 tweets are sent per minute.",
        "500 million tweets are sent per day.",
        "Facebook has more than 2 billion active users who have an average of 155 friends.",
                "There are more than 300 million photos uploaded to Facebook every day, 800 million likes per day, and 175 million love reactions per day.",
                "Your online reputation and privacy worst enemies are WhatsApp, Snapchat, Instagram, Google, Facebook, and Twitter.",
                "Facebook is a divorce lawyers best friend. In fact, 1 in 7 divorces are blamed on Facebook.",
                "Over 4.2 billion data records were stolen in 2016",
        "More than 88 million people will be born this year. They will be born into a data and algorithm economy.",
        "We are in the age of Big Data. 16 zettabytes (16×1021) of unique new data created worldwide in 2016.",
        "90% of the world’s data has been created in the last couple years.",
        "250 million hours of TV shows and movies are watched daily via Netflix",
        "More than 56 million hours of music is streamed daily.",
               "We spend more than 33 million hours playing the game League of Legends.",
        "The amount of technical information is doubling every 2 years. For students starting a 4-year technical or college degree, this means ½ of what they learn in their first year of study will be outdated by their 3rd year of study.",
        "There are currently 7.5 billion people on the planet and in 2050 there will be 10 billion people.",
        "In 1900 14% of the population lived in cities. In 2017 54% of the population lives in cities.",
                "Every minute 7 babies are born in the US, 32 babies are born in China, and 47 babies are born in India.",
        "25% of the population in China with the highest IQ’s is greater than the population in North America… in India it’s the top 28%. Both China and India have more honor kids than North America has kids.",
               " For the first time in history, we have 4 generations working side by side. Traditionalist, Boomer, Gen X, and Millennial. Each are very different in the way they grew up communicating.",
                "A new term has been created, “The Silver Surfer” for those seniors +50 who use the internet on a frequent basis.",
        "The top in-demand jobs that barely existed 10 years ago are Digital Marketing, Cloud Specialist, Social Media Intern, Fintech Manager, IOS and Android Developer, Uber Driver, Data Scientist, Big Data Architect, Transformation Manager.",
                "We are currently preparing students for jobs that don’t exist using technologies that haven’t been invented; in order to solve problems that we don’t even know are problems yet.",
        "10 years ago (2007), Apple launched its first iPhone. 2.3 billion people now own an iPhone now.",
                "Candy Crush earns more than $1.74 million per day and over $636 million per year.",
                "In August 2017 Bitcoin Cryptocurrency Prices reached the $4000 mark.",
        "10 million self-driving cars will be on the road by 2020.",
        "In 2013, Amazon had 1,000 robots operating in its warehouses. Now Amazon has 45,000 robots operating across 20 warehouses.",
        "47% of jobs will disappear in the next 25 years as robots will replace 5 million workers by 2020.",
        "The Digital Revolution is just starting. A working Quantum Computer could arrive within the next 10 years. It will enable exponential jumps in computing power. Artificial intelligence will outperform humans in many activities in the next 10 years."};

        Random Re;
        Re = new Random();
        int rand=Re.nextInt(arr.length);
        text.setText(arr[rand]);
        Log.i("Enter",arr[rand] );
        System.out.println(arr[rand]);
        return view;

        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_home_page, container, false);
    }
}