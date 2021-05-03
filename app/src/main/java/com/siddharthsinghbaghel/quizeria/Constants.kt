package com.siddharthsinghbaghel.quizeria

object Constants{

    const val USER_NAME: String= "user_name"
    const val TOTAL_QUESTION: String= "total_ques"
    const val CORRECT_ANSWER: String= "correct_answer"


    fun getFlagQuestions(): ArrayList<MyQuestions>{

                val questionsList = ArrayList<MyQuestions>()

                val que1 = MyQuestions(1,
                    "What Country does this flag belong to ?",
                    R.drawable.ic_flag_of_india,
                    "India",
                    "Australia",
                    "Argentina",
                    "Alaska",
                    1
                )

        questionsList.add(que1)

        val que2 = MyQuestions(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = MyQuestions(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = MyQuestions(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgium",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = MyQuestions(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France",
            "Fiji", "Finland", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = MyQuestions(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia",
            "Greece", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = MyQuestions(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = MyQuestions(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Ireland", "Iran",
            "Hungary", "Argentina", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = MyQuestions(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = MyQuestions(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsList.add(que10)

        return questionsList

    }

    fun getIndiaQuestions(): ArrayList<MyQuestions>{

        val questionsList = ArrayList<MyQuestions>()

        val que1 = MyQuestions(1,
            "The name of which Indian river means the son of the creator?",
            R.drawable.ic_river_bg,
            "Sutlej",
            "Ganga",
            "Brahmaputra",
            "Krishna",
            3
        )

        questionsList.add(que1)

        val que2 = MyQuestions(
            2,
            "Which state of India is known as the crown of India?",
            R.drawable.ic_crown,
            "Kerela",
            "Karnataka",
            "Jammu and Kashmir",
            "Orrisa",
            3
        )

        questionsList.add(que2)

        // 3
        val que3 = MyQuestions(
            3,
            "What region of India gets its name from the fact that it is drained by five major rivers?",
            R.drawable.ic_confuse,
            "Kerela",
            "Punjab",
            "Kashi",
            "Banaras",
            2
        )

        questionsList.add(que3)

        // 4
        val que4 = MyQuestions(
            4,
            "Black cotton soil is the chief soil type in which geographical feature?",
            R.drawable.ic_confuse,
            "Great Indian Plains",
            "Deccan Plateau",
            "Western Ghats",
            "Coastal Belts",
            2
        )

        questionsList.add(que4)

        // 5
        val que5 = MyQuestions(
            5,
            "Victoria memorial is in?",
            R.drawable.ic_vitoria,
            "Panaji",
            "Mumbai",
            "Kolkata",
            "Delhi",
            3
        )

        questionsList.add(que5)

        // 6
        val que6 = MyQuestions(
            6,
            "Which religion has its roots in India?",
            R.drawable.ic_confuse,
            "Hinduism",
            "Jainism",
            "Buddhism",
            "All of these",
            4
        )

        questionsList.add(que6)

        // 7
        val que7 = MyQuestions(
            7,
            "Name the desert you would find in India.",
            R.drawable.ic_thar,
            "Sahara desert",
            "Gobi desert",
            "Thar desert",
            "Taklamakan desert",
            3
        )

        questionsList.add(que7)

        // 8
        val que8 = MyQuestions(
            8,
            " Name the architect who designed the National Capital Territory of India.",
            R.drawable.ic_confuse,
            "Edwin Lutyens",
            "Vicente Guallart",
            "Jon Jerde",
            "Mateus Fernandes",
            1
        )

        questionsList.add(que8)

        // 9
        val que9 = MyQuestions(
            9,
            "What demarcates the Border between India and Pakistan?",
            R.drawable.ic_confuse,
            "The Radcliffe Line",
            "The Manmohan Line",
            "The McMahon Line",
            "The 38th Parallel",
            1
        )

        questionsList.add(que9)

        // 10
        val que10 = MyQuestions(
            10,
            "Who wrote the National Anthem of India?",
            R.drawable.ic_rnt,
            "Bibhu Padhi",
            "J.L. Nehru",
            "Rabindra Nath Tagore",
            "Sri Aurobindo Ghosh",
            3
        )

        questionsList.add(que10)

        return questionsList

    }


    fun getGreenEarthQuestions(): ArrayList<MyQuestions>{

        val questionsList = ArrayList<MyQuestions>()

        val que1 = MyQuestions(1,
            "The country which is the largest exporter of hippopotamuses in Europe is :",
            R.drawable.ic_hippo,
            "United Kingdom",
            "Hungary",
            "Germany",
            "France",
            2
        )

        questionsList.add(que1)

        val que2 = MyQuestions(
            2,
            "Which of these items can be composted, or turned into natural fertilizer, for your garden?",
            R.drawable.ic_giraafe,
            "Egg Shells",
            "Aluminium Foil",
            "Golf Balls",
            "None Of These",
            1
        )

        questionsList.add(que2)

        // 3
        val que3 = MyQuestions(
            3,
            "Which of these species are threatened by global warming?",
            R.drawable.ic_giraafe,
            "Koala",
            "Clownfish",
            "Arctic fox",
            "All of the above",
            4
        )

        questionsList.add(que3)

        // 4
        val que4 = MyQuestions(
            4,
            "How many degrees has the Earth warmed up in the past 100 years?",
            R.drawable.ic_thermametre,
            "20°C",
            "2°C",
            "1°F",
            "2.2°F",
            3
        )

        questionsList.add(que4)

        // 5
        val que5 = MyQuestions(
            5,
            "What is most frequently found in beach cleanups?",
            R.drawable.ic_plastic,
            "Glass",
            "Shoes",
            "Pieces of plastic",
            "Jewelry",
            3
        )

        questionsList.add(que5)

        // 6
        val que6 = MyQuestions(
            6,
            "Paper can be made from which of these materials?",
            R.drawable.ic_panda,
            "Panda excrement",
            "Hemp",
            "Wood",
            "All of these",
            4
        )

        questionsList.add(que6)

        // 7
        val que7 = MyQuestions(
            7,
            "Which is the greenest form of transportation ?",
            R.drawable.ic_panda,
            "Bicycle",
            "Electric vehicles",
            "Trucks",
            "None of these",
            1
        )

        questionsList.add(que7)

        // 8
        val que8 = MyQuestions(
            8,
            "The selfish humans who kill animals for their own good are called :",
            R.drawable.ic_rhino_great,
            "Black smith",
            "King",
            "Poacher",
            "Lumberjack.",
            3
        )

        questionsList.add(que8)

        // 9
        val que9 = MyQuestions(
            9,
            "How many insect species are present on earth in 2020 ?",
            R.drawable.ic_insect,
            "6.5 Million",
            "1 Trillion",
            "5.5 Million",
            "I don't know, I hate insects",
            3
        )

        questionsList.add(que9)

        // 10
        val que10 = MyQuestions(
            10,
            "Amazon forests are spread in :",
            R.drawable.ic_giraafe,
            "5.5 million km²",
            "50 hectare",
            "29 acres",
            "1 trillion km²",
            1
        )

        questionsList.add(que10)

        return questionsList

    }

    fun getCovidQuestions(): ArrayList<MyQuestions>{

        val questionsList = ArrayList<MyQuestions>()

        val que1 = MyQuestions(1,
            "Basic procedures to follow if come in contact with a person who may have COVID-19:",
            R.drawable.virus,
            "Wash your hands, avoid touching with your eyes & mouth and avoid contact with other people.",
            "Panic! We are all going to die!",
            "Spray the person with Lysol.",
            "Do nothing.  It's probably just a cold.",
            1
        )

        questionsList.add(que1)

        val que2 = MyQuestions(
            2,
            "What does COVID-19 stand for?",
             R.drawable.virus,
            "It's a term for Coronavirus Disease 19, because it's the 19th strain of coronavirus discovered.",
            "It's a term that stands for Coronavirus Disease 2019, the year it was first identified.",
            "I am not familiar with Covid-19",
            "I don't know!",
            2
        )

        questionsList.add(que2)

        // 3
        val que3 = MyQuestions(
            3,
            "What other viruses belong to the corona virus family?",
            R.drawable.virus,
            "SARS and influenza",
            "SARS and MERS",
            "SARS and HIV",
            "All of the above",
            2
        )

        questionsList.add(que3)

        // 4
        val que4 = MyQuestions(
            4,
            "There are currently vaccines for the following corona viruses:",
            R.drawable.virus,
            "SARS",
            "MERS",
            "SARS and MERS",
            "No vaccines till now! :(",
            4
        )

        questionsList.add(que4)

        // 5
        val que5 = MyQuestions(
            5,
            "How does weather seem to affect the novel coronavirus?",
            R.drawable.virus,
            "The virus can’t survive in hot, humid climates.",
            "Cold temperatures can kill the virus.",
            "It is not yet known :|",
            "Virus loves rain! ",
            3
        )

        questionsList.add(que5)

        // 6
        val que6 = MyQuestions(
            6,
            "In India, when did the second phase of COVID-19 vaccination start?",
            R.drawable.virus,
            "December 2020",
            "January 2021",
            "February 2021",
            "March 2021",
            4
        )

        questionsList.add(que6)

        // 7
        val que7 = MyQuestions(
            7,
            " Which of the following statement is/are correct about Favipiravir?",
            R.drawable.virus,
            " Favipiravir is an antiviral COVID-19 drug.",
            " Glenmark Pharmaceuticals under the brand name FabiFlu has launched an antiviral drug Favipiravir.",
            "It is India's first COVID-19 drug launched, priced at Rs 103 per tablet.",
            "Everything seems correct :)",
            4
        )

        questionsList.add(que7)

        // 8
        val que8 = MyQuestions(
            8,
            "Thailand announced that it has proceeded to test it's novel coronavirus vaccine on which animal/bird?",
            R.drawable.virus,
            "Monkeys!",
            " Lizards! :(",
            "Hen!",
            "Chimps! ",
            1
        )

        questionsList.add(que8)

        // 9
        val que9 = MyQuestions(
            9,
            "In a study, which cells are found in COVID-19 patients 'bode well' for long-term immunity?",
            R.drawable.virus,
            "P-cell",
            "D-cell",
            "T-cell",
            "I hate biology! :(",
            3
        )

        questionsList.add(que9)

        // 10
        val que10 = MyQuestions(
            10,
            "Name the vaccine that is jointly developed by the German company BioNTech and US pharma giant Pfizer for COVID-19?",
            R.drawable.virus,
            "BNT162",
            "PICOVACC",
            "Both of the above vaccines",
            "Not sure! :|",
            1
        )

        questionsList.add(que10)

        val que11 = MyQuestions(
            11,
            "Name a clinical trial in which blood is transfused from recovered COVID-19 patients to a coronavirus patient who is in critical condition?",
            R.drawable.virus,
            "Solidarity",
            "Plasma Therapy",
            "Remdesivir",
            "Hydroxychloroquine ",
            2
        )

        questionsList.add(que11)

        val que12 = MyQuestions(
            12,
            "What happens to a person suffering from COVID-19?",
            R.drawable.virus,
            "Around 80% of the people will require no treatment as such and will recover on their own.",
            " Around <20% or a small proportion may need hospitalisation.",
            "A very small proportion basically suffering from chronic illness may need admission in an Intensive Care Unit (ICU).",
            "Everything seems correct :) ",
            4
        )

        questionsList.add(que12)

        val que13 = MyQuestions(
            13,
            "The first case of novel coronavirus was identified in .....",
            R.drawable.virus,
            "Beijing",
            "Shanghai",
            "Wuhan, Hubei, We know the culprit :(",
            "Tianjin",
            3
        )

        questionsList.add(que13)

        val que14 = MyQuestions(
            14,
            "Mild Symptoms of Novel coronavirus are:",
            R.drawable.virus,
            "Fever",
            "Cough",
            "Shortness of breath",
            "Everything seems correct, must go for test if you feel so !",
            4
        )

        questionsList.add(que14)

        val que15 = MyQuestions(
            15,
            "From where coronavirus got its name?",
            R.drawable.virus,
            "Due to their crown-like projections.",
            "Due to their leaf-like projections.",
            "Due to their surface structure of bricks.",
            "I don't know!",
            1
        )

        questionsList.add(que15)

        return questionsList

    }


    fun getSportsQuestions(): ArrayList<MyQuestions>{

        val questionsList = ArrayList<MyQuestions>()

        val que1 = MyQuestions(1,
                "Who among the following was the First Indian Cricketer to bag 500 wickets in Test matches?",
                R.drawable.ic_wicket,
                "Kapil Dev",
                "Srinath",
                "Anil Kumble",
                "I don't know, I love football ! ;)",
                3
        )

        questionsList.add(que1)

        val que2 = MyQuestions(
                2,
                "Which among the following is known as “Bible of Cricket”?",
                R.drawable.ic_cricketer,
                "All Out Cricket",
                "Cricinfo Magazine",
                "I am not familiar with Bible! :(",
                "Wisden",
                4
        )

        questionsList.add(que2)

        // 3
        val que3 = MyQuestions(
                3,
                "What is the approximate maximum weight of Golf Ball as per Rules of Golf?",
                R.drawable.ic_golf_ball,
                "45 gms",
                "25 gms",
                "40 gms",
                "I hate golf! :(",
                1
        )

        questionsList.add(que3)

        // 4
        val que4 = MyQuestions(
                4,
                "The name of Professor Guru Dutt Sondhi is known behind the foundation of which among the following?",
                R.drawable.ic_guru_dutt_sodhi,
                "Olympic Association of India",
                "Asian Games Federation",
                "Indian Premier League",
                "Indian Badminton League",
                2
        )

        questionsList.add(que4)

        // 5
        val que5 = MyQuestions(
                5,
                "When was the Olympic mascot used majorly?",
                R.drawable.ic_olympic,
                "1956",
                "1964",
                "1980",
                "I am bad at remembering dates! ",
                3
        )

        questionsList.add(que5)

        // 6
        val que6 = MyQuestions(
                6,
                "Who is the most successful boxer in the World Amateur Boxing Championships in men?",
                R.drawable.ic_boxers,
                "Roberto Balado",
                "Felix Savon",
                "Zou Shiming",
                "I am the best  Boxer! ;) ",
                2
        )

        questionsList.add(que6)

        // 7
        val que7 = MyQuestions(
                7,
                "Where did the first UCI Mountain Bike World Championships take place?",
                R.drawable.ic_uci_bike,
                "United States",
                "Italy",
                "France",
                "Germany",
                1
        )

        questionsList.add(que7)

        // 8
        val que8 = MyQuestions(
                8,
                "Who was the first marketing director of the International Olympic Committee?",
                R.drawable.ic_olympic,
                "Michael Payne",
                " Richard Pound",
                " Avery Brundage",
                "James Bond 007 ;) ",
                1
        )

        questionsList.add(que8)

        // 9
        val que9 = MyQuestions(
                9,
                "Where were the last Deaflympics held?",
                R.drawable.ic_deafylimpic,
                "Switzerland",
                "Turkey",
                "Greece",
                "Ah! What is that? :|",
                2
        )

        questionsList.add(que9)

        // 10
        val que10 = MyQuestions(
                10,
                "Who had won a Gold Medal in the Women’s individual event of Trampoline gymnastics in the 2016 Rio Olympics?",
                R.drawable.ic_trampoline,
                "Rosie MacLennan",
                "Bryony Page",
                "Li Dan",
                "Trampoline gymnastics is in Olympics ? :|",
                1
        )

        questionsList.add(que10)

        val que11 = MyQuestions(
                11,
                "Who is the President of World Chess Federation?",
                R.drawable.ic_chess,
                "D.V. Sundar",
                "Arkady Dvorkovich",
                "Mackey Mclaren",
                "Rosie MacLennan ",
                2
        )

        questionsList.add(que11)

        val que12 = MyQuestions(
                12,
                "Which Indian pair won the Wimbledon and US Open titles in 1999?",
                R.drawable.ic_us_opens,
                "Ramkumar Ramanathan and Rohan Bopanna",
                "Leander Paes and Mahesh Bhupathi",
                "Yuki Bhambri and Vijay Amritraj",
                "I don't know who but I am proud of them! ;) ",
                2
        )

        questionsList.add(que12)

        val que13 = MyQuestions(
                13,
                "When was the first time the Commonwealth Games were held in Asia?",
                R.drawable.ic_cwg,
                "1994",
                "1998",
                "1990",
                "I am bad at remembering dates! :(",
                1
        )

        questionsList.add(que13)

        val que14 = MyQuestions(
                14,
                "What was the total prize money pool of the 2015 ICC World Cup?",
                R.drawable.ic_icc_wc,
                "$5 million",
                "$7 million",
                "$10 million",
                "$12 million",
                3
        )

        questionsList.add(que14)

        val que15 = MyQuestions(
                15,
                "How many medals have been won by India in the all time medal count as of 2018 World Wrestling Championships?",
                R.drawable.ic_medals,
                "26",
                "35",
                "10",
                "13",
                4
        )

        questionsList.add(que15)

        return questionsList

    }

    fun getTechQuestions(): ArrayList<MyQuestions>{

        val questionsList = ArrayList<MyQuestions>()

        val que1 = MyQuestions(1,
            "Google Inc. was founded in ____ ?",
            R.drawable.ic_wicket,
            "1996",
            "1998",
            "2000",
            "I am bad at remembering dates! ;)",
            2
        )

        questionsList.add(que1)

        val que2 = MyQuestions(
            2,
            "Google Inc. was founded by ______ ?",
            R.drawable.ic_cricketer,
            "Sergey Page and Larry Brin",
            "Eric Schmidt and Larry Page",
            "Larry Page and Sergey Brin",
            "I don't Know, I only use google!",
            3
        )

        questionsList.add(que2)

        // 3
        val que3 = MyQuestions(
            3,
            "What is the only good reason to not back up your data today?",
            R.drawable.ic_golf_ball,
            "It is not important.",
            "You plan to do it soon.s",
            "You don't think you will lose your data.",
            "You already have several recently verified backups available.",
            4
        )

        questionsList.add(que3)

        // 4
        val que4 = MyQuestions(
            4,
            "What is the opposite of a proprietary file format?",
            R.drawable.ic_guru_dutt_sodhi,
            "Closed format",
            "Open format",
            "Internal format",
            "I don't know much about tech, I am here just to see quiz! ;) ",
            2
        )

        questionsList.add(que4)

        // 5
        val que5 = MyQuestions(
            5,
            "An standard bitmap image has what file extension?",
            R.drawable.ic_olympic,
            ".BIT",
            ".BMP",
            ".MAP",
            ".IMG ",
            2
        )

        questionsList.add(que5)

        // 6
        val que6 = MyQuestions(
            6,
            "In computer programming, the \"\\n\" character typically represents what?",
            R.drawable.ic_boxers,
            "Newline",
            "NULL",
            "NaN",
            "I never been through programming! ",
            1
        )

        questionsList.add(que6)

        // 7
        val que7 = MyQuestions(
            7,
            "What system handles network monitoring, device detection, and device management?",
            R.drawable.ic_uci_bike,
            "DNS",
            "CMS",
            "NMS",
            "I don't know!",
            3
        )

        questionsList.add(que7)

        // 8
        val que8 = MyQuestions(
            8,
            "WPA2 is used to encrypt data transmissions over what type of connection?",
            R.drawable.ic_olympic,
            "Ethernet",
            "USB",
            "Bluetooth",
            "Wi-Fi ",
            4
        )

        questionsList.add(que8)

        // 9
        val que9 = MyQuestions(
            9,
            "What statement best describes \"flexible\" software?",
            R.drawable.ic_deafylimpic,
            "It is developed for multiple platforms.",
            "It can be used for multiple purposes, rather than a single function.",
            "It is regularly updated by the developer.",
            "I don't know, I work on hardware! :|",
            2
        )

        questionsList.add(que9)

        // 10
        val que10 = MyQuestions(
            10,
            "A data transmission from a single source to multiple recipients is called what?",
            R.drawable.ic_trampoline,
            "Mulltiplex",
            "Multicast",
            "Multithread",
            "Multiprocess",
            2
        )

        questionsList.add(que10)

        val que11 = MyQuestions(
            11,
            "Which of the following is a type of malware?",
            R.drawable.ic_chess,
            "Piggy bank",
            "Mad dog",
            "Trojan horse",
            "Rabbit's foot ",
            3
        )

        questionsList.add(que11)

        val que12 = MyQuestions(
            12,
            "What function key is commonly used as a Help shortcut in Windows programs?",
            R.drawable.ic_us_opens,
            "F1",
            "F2",
            "F3",
            "F4",
            1
        )

        questionsList.add(que12)

        val que13 = MyQuestions(
            13,
            "In what state was the Gopher search technology developed?",
            R.drawable.ic_cwg,
            "Wisconsin",
            "Iowa",
            "Illinois",
            "Minnesota",
            4
        )

        questionsList.add(que13)

        val que14 = MyQuestions(
            14,
            "What graphics API is developed by Microsoft?",
            R.drawable.ic_icc_wc,
            "Picasso",
            "Direct3D",
            "Metal",
            "Glide",
            2
        )

        questionsList.add(que14)

        val que15 = MyQuestions(
            15,
            "Comment sections below articles on webpages are a modern version of what?",
            R.drawable.ic_medals,
            "Web 2.0",
            "Web forum",
            "Web beacon",
            "13",
            2
        )

        questionsList.add(que15)

        val que16 = MyQuestions(
            16,
            "What is the purpose of ICS technology?",
            R.drawable.ic_medals,
            "It provides secure wireless data transfers.",
            "It allows mobile phones to communicate directly with each other.",
            "It allows multiple computers to share an Internet connection.",
            "It prevents anyone from using a stolen computer.",
            3
        )

        questionsList.add(que16)

        val que17 = MyQuestions(
            17,
            "What is another name of a LAN or WLAN within a home?",
            R.drawable.ic_medals,
            "PAN",
            "PLAN",
            "HLAN",
            "HAN",
            4
        )

        questionsList.add(que17)

        val que18 = MyQuestions(
            18,
            "Which of the following is a type of printer?",
            R.drawable.ic_medals,
            "Inkspace",
            "Inkblot",
            "Inkjet",
            "Inkpad",
            3
        )

        questionsList.add(que18)

        val que19 = MyQuestions(
            19,
            "What is a technical document that explains a new technology called?",
            R.drawable.ic_medals,
            "White paper",
            "Green leaft",
            "Beige book",
            "Red envelope",
            1
        )

        questionsList.add(que19)

        val que20 = MyQuestions(
            20,
            "Which of the following adjustments applies to a grayscale image?",
            R.drawable.ic_medals,
            "Hue",
            "Luminance",
            "Saturation",
            "Vibrance",
            2
        )

        questionsList.add(que20)

        return questionsList

    }
}