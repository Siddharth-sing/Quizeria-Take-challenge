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
            R.drawable.ic_blue_qm,
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
}