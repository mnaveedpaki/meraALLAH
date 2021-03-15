package com.edu.pk.gulehri.meraallah.Model;

import com.edu.pk.gulehri.meraallah.R;

public class Model {

    public Model(){}

    public static int position = 0;
    public static final int[] ALLAHNameIds = {R.raw.a1,R.raw.a2,R.raw.a3,R.raw.a4,R.raw.a5,R.raw.a6,R.raw.a7,R.raw.a8,R.raw.a9,R.raw.a10,R.raw.a11,R.raw.a12,R.raw.a13,R.raw.a14,R.raw.a15,R.raw.a16,R.raw.a17,R.raw.a18,R.raw.a19,R.raw.a20,R.raw.a21,R.raw.a22,R.raw.a23,R.raw.a24,R.raw.a25,R.raw.a26,R.raw.a27,R.raw.a28,R.raw.a29,R.raw.a30,R.raw.a31,R.raw.a32,R.raw.a33,R.raw.a34,R.raw.a35,R.raw.a36,R.raw.a37,R.raw.a38,R.raw.a39,R.raw.a40,R.raw.a41,R.raw.a42,R.raw.a43,R.raw.a44,R.raw.a45,R.raw.a46,R.raw.a47,R.raw.a48,R.raw.a49,R.raw.a50,R.raw.a51,R.raw.a52,R.raw.a53,R.raw.a54,R.raw.a55,R.raw.a56,R.raw.a57,R.raw.a58,R.raw.a59,R.raw.a60,R.raw.a61,R.raw.a62,R.raw.a63,R.raw.a64,R.raw.a65,R.raw.a66,R.raw.a67,R.raw.a68,R.raw.a69,R.raw.a70,R.raw.a71,R.raw.a72,R.raw.a73,R.raw.a74,R.raw.a75,R.raw.a76,R.raw.a77,R.raw.a78,R.raw.a79,R.raw.a80,R.raw.a81,R.raw.a82,R.raw.a83,R.raw.a84,R.raw.a85,R.raw.a86,R.raw.a87,R.raw.a88,R.raw.a89,R.raw.a90,R.raw.a91,R.raw.a92,R.raw.a93,R.raw.a94,R.raw.a95,R.raw.a96,R.raw.a97,R.raw.a98,R.raw.a99};

    public static final int[] RASOOLNameIds = {R.raw.m1,R.raw.m2,R.raw.m3,R.raw.m4,R.raw.m5,R.raw.m6,R.raw.m7,R.raw.m8,R.raw.m9,R.raw.m10,R.raw.m11,R.raw.m12,R.raw.m13,R.raw.m14,R.raw.m15,R.raw.m16,R.raw.m17,R.raw.m18,R.raw.m19,R.raw.m20,R.raw.m21,R.raw.m22,R.raw.m23,R.raw.m24,R.raw.m25,R.raw.m26,R.raw.m27,R.raw.m28,R.raw.m29,R.raw.m30,R.raw.m31,R.raw.m32,R.raw.m33,R.raw.m34,R.raw.m35,R.raw.m36,R.raw.m37,R.raw.m38,R.raw.m39,R.raw.m40,R.raw.m41,R.raw.m42,R.raw.m43,R.raw.m44,R.raw.m45,R.raw.m46,R.raw.m47,R.raw.m48,R.raw.m49,R.raw.m50,R.raw.m51,R.raw.m52,R.raw.m53,R.raw.m54,R.raw.m55,R.raw.m56,R.raw.m57,R.raw.m58,R.raw.m59,R.raw.m60,R.raw.m61,R.raw.m62,R.raw.m63,R.raw.m64,R.raw.m65,R.raw.m66,R.raw.m67,R.raw.m68,R.raw.m69,R.raw.m70,R.raw.m71,R.raw.m72,R.raw.m73,R.raw.m74,R.raw.m75,R.raw.m76,R.raw.m77,R.raw.m78,R.raw.m79,R.raw.m80,R.raw.m81,R.raw.m82,R.raw.m83,R.raw.m84,R.raw.m85,R.raw.m86,R.raw.m87,R.raw.m88,R.raw.m89,R.raw.m90,R.raw.m91,R.raw.m92,R.raw.m93,R.raw.m94,R.raw.m95,R.raw.m96,R.raw.m97,R.raw.m98,R.raw.m99,R.raw.m100,R.raw.m101,R.raw.m102};

    public static final Model[] ALLAH = {
            new Model("اَللَّهُ", "ALLAH", "The Greatest Name, GOD", "بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ", "In the name of Allah , the Entirely Merciful, the Especially Merciful. [1:1]"),
            new Model("اَلرَّحْمَنُ", "AR-RAHMAAN", "The Most Beneficent", "بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ", "In the name of Allah , the Entirely Merciful, the Especially Merciful. [1:1]"),
            new Model("اَلرَّحِیمُ", "AR-RAHEEM", "The Ever-Merciful", "بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ", "In the name of Allah , the Entirely Merciful, the Especially Merciful. [1:1]"),
            new Model("اَلْمَلِكُ", "AL-MALIK", "The King", "فَتَعَـٰلَى ٱللَّهُ ٱلْمَلِكُ ٱلْحَقُّ ۖ لَآ إِلَـٰهَ إِلَّا هُوَ رَبُّ ٱلْعَرْشِ ٱلْكَرِيمِ", "Exalted is Allah, the True King! There is no god ˹worthy of worship˺ except Him, the Lord of the Honourable Throne. [23:116]"),
            new Model("اَلْقُدُّوسُ", "AL-QUDDUS", "The All-Pure", "يُسَبِّحُ لِلَّهِ مَا فِى ٱلسَّمَـٰوَٰتِ وَمَا فِى ٱلْأَرْضِ ٱلْمَلِكِ ٱلْقُدُّوسِ ٱلْعَزِيزِ ٱلْحَكِيمِ", "Whatever is in the heavens and whatever is on the earth ˹constantly˺ glorifies Allah—the King, the Most Holy, the Almighty, the All-Wise. [62:1]"),
            new Model("اَلسَّلاَمُ", "AS-SALAM", "The Giver of Peace", "هُوَ اللَّهُ الَّذِي لَا إِلَهَ إِلَّا هُوَ الْمَلِكُ الْقُدُّوسُ السَّلَامُ الْمُؤْمِنُ الْمُهَيْمِنُ الْعَزِيزُ الْجَبَّارُ الْمُتَكَبِّرُ", "He is Allah, other than whom there is no deity, the Sovereign, the Pure, the Perfection, the Bestower of Faith, the Overseer, the Exalted in Might, the Compeller, the Superior… [59:23]"),
            new Model("اَلْمُؤْمِنُ", "AL-MUMIN", "The Granter of Security and The Giver of Belief (Emaan)", "هُوَ اللَّهُ الَّذِي لَا إِلَهَ إِلَّا هُوَ الْمَلِكُ الْقُدُّوسُ السَّلَامُ الْمُؤْمِنُ الْمُهَيْمِنُ الْعَزِيزُ الْجَبَّارُ الْمُتَكَبِّرُ", "He is Allah, other than whom there is no deity, the Sovereign, the Pure, the Perfection, the Bestower of Faith, the Overseer, the Exalted in Might, the Compeller, the Superior… [59:23]"),
            new Model("اَلْمُھَیْمِنُ", "AL-MUHAYMIN", " The Absolute Guardian Over All", "هُوَ اللَّهُ الَّذِي لَا إِلَهَ إِلَّا هُوَ الْمَلِكُ الْقُدُّوسُ السَّلَامُ الْمُؤْمِنُ الْمُهَيْمِنُ الْعَزِيزُ الْجَبَّارُ الْمُتَكَبِّرُ", "He is Allah, other than whom there is no deity, the Sovereign, the Pure, the Perfection, the Bestower of Faith, the Overseer, the Exalted in Might, the Compeller, the Superior… [59:23]"),
            new Model("اَلْعَزِیزُ", "AL-AZEEZ", "The Almighty", "هُوَ اللَّهُ الَّذِي لَا إِلَهَ إِلَّا هُوَ الْمَلِكُ الْقُدُّوسُ السَّلَامُ الْمُؤْمِنُ الْمُهَيْمِنُ الْعَزِيزُ الْجَبَّارُ الْمُتَكَبِّرُ", "He is Allah, other than whom there is no deity, the Sovereign, the Pure, the Perfection, the Bestower of Faith, the Overseer, the Exalted in Might, the Compeller, the Superior… [59:23]"),
            new Model("اَلْجَبَّارُ", "AL-JABBAR", "The Supreme Power", "هُوَ اللَّهُ الَّذِي لَا إِلَهَ إِلَّا هُوَ الْمَلِكُ الْقُدُّوسُ السَّلَامُ الْمُؤْمِنُ الْمُهَيْمِنُ الْعَزِيزُ الْجَبَّارُ الْمُتَكَبِّرُ", "He is Allah, other than whom there is no deity, the Sovereign, the Pure, the Perfection, the Bestower of Faith, the Overseer (dominant), the Exalted in Might, the Compeller, the Superior… [59:23]"),
            new Model("اَلْمُتَكَبِّرُ", "AL-MUTAKABBIR", "The Possessor of Greatness", "هُوَ اللَّهُ الَّذِي لَا إِلَهَ إِلَّا هُوَ الْمَلِكُ الْقُدُّوسُ السَّلَامُ الْمُؤْمِنُ الْمُهَيْمِنُ الْعَزِيزُ الْجَبَّارُ الْمُتَكَبِّرُ", "He is Allah, other than whom there is no deity, the Sovereign, the Pure, the Perfection, the Bestower of Faith, the Overseer (dominant), the Exalted in Might, the Compeller, the Superior… [59:23]"),
            new Model("اَلْخَالِقُ", "AL-KHAALIQ", "The Creator", "هُوَ اللَّهُ الْخَالِقُ الْبَارِئُ الْمُصَوِّرُ...", "He is Allah , the Creator, the Inventor, the Fashioner... [59:24]"),
            new Model("اَلْبَارِئُ", "AL-BAARI", "The Evolver", "هُوَ اللَّهُ الْخَالِقُ الْبَارِئُ الْمُصَوِّرُ...", "He is Allah , the Creator, the Inventor (originator), the Fashioner... [59:24]"),
            new Model("اَلْمُصَوِّرُ", "AL-MUSAWWIR", "The Artist", "هُوَ اللَّهُ الْخَالِقُ الْبَارِئُ الْمُصَوِّرُ...", "He is Allah: the Creator, the Inventor, the Shaper.... [59:24]"),
            new Model("اَلْغَفَّارُ", "AL-GHAFFAR", "The Absolute Forgiver", "فَقُلْتُ ٱسْتَغْفِرُوا۟ رَبَّكُمْ إِنَّهُۥ كَانَ غَفَّارًۭا", "Saying, ‘Seek your Lord’s forgiveness, ˹for˺ He is truly Most Forgiving. [71:10]"),
            new Model("اَلْقَهَّارُ", "AL-QAHHAR", "The All-Prevailing One", "هُوَ اللَّهُ الْوَاحِدُ الْقَهَّارُ", "He is Allah , the One, the Prevailing. [39:4]"),
            new Model("اَلْوَهَّابُ", "AL-WAHHAAB", "The Absolute Bestower", "أَمْ عِندَهُمْ خَزَآئِنُ رَحْمَةِ رَبِّكَ ٱلْعَزِيزِ ٱلْوَهَّابِ", "Or ˹is it because˺ they possess the treasuries of the mercy of your Lord—the Almighty, the Giver ˹of all bounties˺. [38:9]"),
            new Model("اَلْرَّزَّاقُ", "AR-RAZZAAQ", "The All-Provider", "إِنَّ اللَّهَ هُوَ الرَّزَّاقُ ذُو الْقُوَّةِ الْمَتِينُ", "Indeed, it is Allah who is the Provider, the firm possessor of strength. [51:58]"),
            new Model("اَلْفَتَّاحُ", "AL-FATTAAH", "The Opener of the Gates of Profits", "...وَهُوَ الْفَتَّاحُ الْعَلِيمُ", "...And He is the Knowing Judge (Arbiter). [34:26]"),
            new Model("اَلْعَلِيمُ", "AL-ALEEM", "The Possessor of Knowing Much of Ever Thing", "إِنَّ رَبَّكَ هُوَ ٱلْخَلَّـٰقُ ٱلْعَلِيمُ", "Surely your Lord is the Master Creator, All-Knowing. [15:86]"),
            new Model("اَلْقَابِضُ", "AL-QAABID", "The Withholder", "مَّن ذَا ٱلَّذِى يُقْرِضُ ٱللَّهَ قَرْضًا حَسَنًۭا فَيُضَـٰعِفَهُۥ لَهُۥٓ أَضْعَافًۭا كَثِيرَةًۭ ۚ وَٱللَّهُ يَقْبِضُ وَيَبْصُۜطُ وَإِلَيْهِ تُرْجَعُونَ", "Who will lend to Allah a good loan which Allah will multiply many times over? It is Allah ˹alone˺ who decreases and increases ˹wealth˺. And to Him you will ˹all˺ be returned. [2:245]"),
            new Model("اَلْبَاسِطُ", "AL-BAASIT", "The Generous Provider", "مَّن ذَا ٱلَّذِى يُقْرِضُ ٱللَّهَ قَرْضًا حَسَنًۭا فَيُضَـٰعِفَهُۥ لَهُۥٓ أَضْعَافًۭا كَثِيرَةًۭ ۚ وَٱللَّهُ يَقْبِضُ وَيَبْصُۜطُ وَإِلَيْهِ تُرْجَعُونَ", "Who will lend to Allah a good loan which Allah will multiply many times over? It is Allah ˹alone˺ who decreases and increases ˹wealth˺. And to Him you will ˹all˺ be returned. [2:245]"),
            new Model("اَلْخَافِضُ", "AL-KHAAFIDH", "The Humiliator", "خَافِضَةٌۭ رَّافِعَةٌ", "It will debase ˹some˺ and elevate ˹others˺. [56:3]"),
            new Model("اَلْرَّافِعُ", "AR-RAAFI", "The Upgrader", "... نَرْفَعُ دَرَجَـٰتٍۢ مَّن نَّشَآءُ ۗ... ", "...We elevate in rank whoever We please... [6:83]"),
            new Model("اَلْمُعِزُ", "AL-MUIZZ", "The Bestower of Honor", "قُلِ ٱللَّهُمَّ مَـٰلِكَ ٱلْمُلْكِ تُؤْتِى ٱلْمُلْكَ مَن تَشَآءُ وَتَنزِعُ ٱلْمُلْكَ مِمَّن تَشَآءُ وَتُعِزُّ مَن تَشَآءُ وَتُذِلُّ مَن تَشَآءُ ۖ...", "Say, ˹O Prophet,˺ “O Allah! Lord over all authorities! You give authority to whoever You please and remove it from who You please; You honour whoever You please and disgrace who You please... [3:26]"),
            new Model("اَلْمُذِلُّ", "AL-MUZIL", "The Giver of Disgrace", "قُلِ ٱللَّهُمَّ مَـٰلِكَ ٱلْمُلْكِ تُؤْتِى ٱلْمُلْكَ مَن تَشَآءُ وَتَنزِعُ ٱلْمُلْكَ مِمَّن تَشَآءُ وَتُعِزُّ مَن تَشَآءُ وَتُذِلُّ مَن تَشَآءُ ۖ...", "Say, ˹O Prophet,˺ “O Allah! Lord over all authorities! You give authority to whoever You please and remove it from who You please; You honour whoever You please and disgrace who You please... [3:26]"),
            new Model("اَلْسَّمِيعُ", "AS-SAMEE", "The All-Hearing", "...إِنَّ ٱللَّهَ سَمِيعٌ عَلِيمٌۭ", "...surely Allah is All-Hearing, All-Knowing. [2:127]"),
            new Model("اَلْبَصِيرُ", "AL-BASEER", "The All-Seeing", "...إِنَّهُ هُوَ السَّمِيعُ البَصِيرُ", "…Indeed, He is the Hearing, the Seeing. [17:1]"),
            new Model("اَلْحَكَمُ", "AL-HAKAM", "The Judge", " إِنَّ اللَّهَ هُوَ الْحَكَمُ وَإِلَيْهِ الْحُكْمُ...", "Allah is Al-Hakam (the Judge) and judgment is His… [Nasa’i 5387]"),
            new Model("اَلْعَدْلُ", "AL-ADL", "THE EMBODIMENT OF JUSTICE", "لم يرد ذكرها في القرآن.", "Not Quranic, see al-Kafʿamī (1992:40)"),
            new Model("اَلْلَّطِيفُ", "AL-LATEEF", "The All-Subtle", "أَلَمْ تَرَ أَنَّ ٱللَّهَ أَنزَلَ مِنَ ٱلسَّمَآءِ مَآءًۭ فَتُصْبِحُ ٱلْأَرْضُ مُخْضَرَّةً ۗ إِنَّ ٱللَّهَ لَطِيفٌ خَبِيرٌۭ", "Do you not see that Allah sends down rain from the sky, then the earth becomes green? Surely Allah is Most Subtle, All-Aware. [26:63]"),
            new Model("اَلْخَبِيرُ", "AL-KHABEER", "The All-Aware", "...إِنَّ اللَّهَ لَطِيفٌ خَبِيرٌ", "…Indeed, Allah is Subtle and Acquainted. [22:63]"),
            new Model("اَلْحَلِيمُ", "AL-HALEEM", "The Most Forbearing", "إِنَّ اللّهَ غَفُورٌ حَلِيمٌ", "…Indeed, Allah is Forgiving and Forbearing.” [3:155] "),
            new Model("اَلْعَظِيمُ", "AL-AZHEEM", "The Most Great, The Ever-Magnificent", "", ""),
            new Model("اَلْغَفُورُ", "AL-GHAFOOR", "The Great Forgiver", "نُزُلًۭا مِّنْ غَفُورٍۢ رَّحِيمٍۢ", "an accommodation from the All-Forgiving, Most Merciful ˹Lord˺. [41:32]"),
            new Model("اَلْشَّكُورُ", "ASH-SHAKOOR", "The Most Appreciative", "لِيُوَفِّيَهُمْ أُجُورَهُمْ وَيَزِيدَهُم مِّن فَضْلِهِۦٓ ۚ إِنَّهُۥ غَفُورٌۭ شَكُورٌۭ", "so that He will reward them in full and increase them out of His grace. He is truly All-Forgiving, Most Appreciative. [35:30]"),
            new Model("اَلْعَلِيُّ", "AL-ALEE", "The Most High", "...وَلَا يَئُودُهُ حِفْظُهُمَا ۚ وَهُوَ الْعَلِيُّ الْعَظِيمُ", "....and their preservation tires Him not. And He is the Most High, the Most Great. [2:255]"),
            new Model("اَلْكَبِيرُ", "AL-KABEER", "The All-Heedful and All-Protecting", "عَـٰلِمُ ٱلْغَيْبِ وَٱلشَّهَـٰدَةِ ٱلْكَبِيرُ ٱلْمُتَعَالِ", "˹He is the˺ Knower of the seen and the unseen—the All-Great, Most Exalted. [13:9]"),
            new Model("اَلْحَفِيظُ", "AL-HAFEEDH", "The All-Watching", "...فَاللّهُ خَيْرٌ حَافِظًا وَهُوَ أَرْحَمُ الرَّاحِمِينَ", "…But Allah is the best guardian… [12:64]"),
            new Model("اَلْمُقِيتُ", "AL-MUQEET", "The Sustainer", "...وَكَانَ اللّهُ عَلَى كُلِّ شَيْءٍ مُّقِيتًا", "...And Allah is Watchful over all things. [4:85]"),
            new Model("اَلْحَسِيبُ", "AL-HASEEB", "The Ever-Reckoner", "....إِنَّ اللّهَ كَانَ عَلَى كُلِّ شَيْءٍ حَسِيبًا", "…Indeed, Allah is ever, over all things, an Accountant (Ever-Reckoner). [4:86]"),
            new Model("اَلْجَلِيلُ", "AL-JALEEL", "The Majestic", "", ""),
            new Model("اَلْكَرِيمُ", "AL-KAREEM", "The Most Generous", "", ""),
            new Model("اَلْرَّقِيبُ", "AR-RAQEEB", "The Ever-Watchful", "", ""),
            new Model("اَلْمُجِيبُ", "AL-MUJEEB", "The Supreme Answerer", "", ""),
            new Model("اَلْوَاسِعُ", "AL-WAASI", "The All-Encompassing", "", ""),
            new Model("اَلْحَكِيمُ", "AL-HAKEEM", "The Ever-Wise", "", ""),
            new Model("اَلْوَدُودُ", "AL-WADOOD", "The Most Loving", "", ""),
            new Model("اَلْمَجِيدُ", "AL-MAJEED", "The Most Honorable", "", ""),
            new Model("اَلْبَاعِثُ", "AL-BAITH", "The Infuser of New Life", "", ""),
            new Model("اَلْشَّهِيدُ", "ASH-SHAHEED", "The All Observing Witnessing", " وَأَنتَ عَلَى كُلِّ شَيْءٍ شَهِيدٌ", "…and You are, over all things, Witness. [5:117]"),
            new Model("اَلْحَقُّ", "AL-HAQQ", "The Truth Absolute", "أَنَّ اللَّهَ هُوَ الْحَقُّ الْمُبِينُ ", "… it is Allah who is the perfect in justice. [24:25]"),
            new Model("اَلْوَكِيلُ", "AL-WAKEEL", "The Disposer of Affairs", "", ""),
            new Model("اَلْقَوِيُّ", "AL-QAWIYY", "The All-Strong", "", ""),
            new Model("اَلْمَتِينُ", "AL-MATEEN", "The Firm", "", ""),
            new Model("اَلْوَليُّ", "AL-WALIYY", "The Protecting Associate", "", ""),
            new Model("اَلْحَمِيدُ", "AL-HAMEED", "The All-Praiseworthy", "فَإِنَّ اللَّهَ هُوَ الْغَنِيُّ الْحَمِيدُ", "…indeed, Allah is the Free of need, the Praiseworthy. [57:24]"),
            new Model("اَلْمُحْصِيُ", "AL-MUHSEE", "The All-Enumerating", "", ""),
            new Model("اَلْمُبْدِئُ", "AL-MUBDI", "The Originator", "", ""),
            new Model("اَلْمُعِيدُ", "AL-MUID", "The Reinstater Who Brings Back All", "", ""),
            new Model("اَلْمُحْيِى", "AL-MUHYEE", "The Giver of Life", "", ""),
            new Model("اَلْمُمِيت", "AL-MUMEET", "The Bringer of Death", "", ""),
            new Model("اَلْحَىُّ", "AL-HAYY", "The Ever-Living", "اللّهُ لاَ إِلَـهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ ", "Allah – there is no deity except Him, the Ever-Living, the Sustainer of existence… [2:255] "),
            new Model("اَلْقَيُّومُ", "AL-QAYYOOM", "The Self-Subsisting", "اللّهُ لاَ إِلَـهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ ", "Allah – there is no deity except Him, the Ever-Living, the Sustainer of existence… [2:255] "),
            new Model("اَلْوَاجِدُ", "AL-WAAJID", "The Finder", "", ""),
            new Model("اَلْمَاجِدُ", "AL-MAAJID", "The Magnificent", "", ""),
            new Model("اَلْوَاحِدُ", "AL-WAAHID", "The Unique", "", ""),
            new Model("اَلْأَحَد", "AL-AHAD", "The Only One", "", ""),
            new Model("اَلْصَّمَدُ", "AS-SAMAD", "The Self-Sufficient", "", ""),
            new Model("اَلْقَادِرُ", "AL-QADIR", "He Who is able to do Everything", "", ""),
            new Model("اَلْمُقْتَدِرُ", "AL-MUQTADIR", "The All-Powerful", "", ""),
            new Model("اَلْمُقَدِّمُ", "AL-MUQADDIM", "He Who Brings Forward", "", ""),
            new Model("اَلْمُؤَخِّرُ", "AL-MUAKHKHIR", "He Who Puts Far Away", "", ""),
            new Model("اَلأَوَّلُ", "AL-AWWAL", "The First", " هُوَ الْأَوَّلُ وَالْآخِرُ وَالظَّاهِرُ وَالْبَاطِنُ وَهُوَ بِكُلِّ شَيْءٍ عَلِيمٌ", "He is the First and the Last, the Ascendant and the Intimate, and He is, of all things, Knowing. [57:3]"),
            new Model("اَلْآخِرُ", "AL-AAKHIR", "The Last", "هُوَ الْأَوَّلُ وَالْآخِرُ وَالظَّاهِرُ وَالْبَاطِنُ وَهُوَ بِكُلِّ شَيْءٍ عَلِيمٌ ", "He is the First and the Last, the Ascendant and the Intimate, and He is, of all things, Knowing. [57:3]"),
            new Model("اَلْظَّاهِرُ", "AZ-DHAAHIR", "The Manifest", "هُوَ الْأَوَّلُ وَالْآخِرُ وَالظَّاهِرُ وَالْبَاطِنُ وَهُوَ بِكُلِّ شَيْءٍ عَلِيمٌ ", "He is the First and the Last, the Ascendant and the Intimate, and He is, of all things, Knowing. [57:3]"),
            new Model("اَلْبَاطِنُ", "AL-BAATIN", "Knower of the Hidden", "هُوَ الْأَوَّلُ وَالْآخِرُ وَالظَّاهِرُ وَالْبَاطِنُ وَهُوَ بِكُلِّ شَيْءٍ عَلِيمٌ ", "He is the First and the Last, the Ascendant and the Intimate, and He is, of all things, Knowing. [57:3]"),
            new Model("اَلْوَالِي", "AL-WAALI", "The Governor", "", ""),
            new Model("اَلْمُتَعَالِي", "AL-MUTAALI", "The Supremely Exalted", "", ""),
            new Model("اَلْبَرُّ", "AL-BARR", "The Source of All Goodness", "...إِنَّهُ هُوَ الْبَرُّ الرَّحِيمُ", "...He is truly the Most Kind, Most Merciful. [52:28]"),
            new Model("اَلْتّوَّاْبُ", "AT-TAWWAB", "The Acceptor of Repentance", "...إِنَّهُ هُوَ التَّوَّابُ الرَّحِيمُ", "…Indeed, it is He who is the Accepting of repentance, the Merciful. [2:37]"),
            new Model("اَلْمُنْتَقِمُ", "AL-MUNTAQIM", "The Avenger", "فَإِمَّا نَذْهَبَنَّ بِكَ فَإِنَّا مِنْهُم مُّنتَقِمُونَ", "Even if We take you away ˹from this world˺, We will surely inflict punishment upon them. [43:41]"),
            new Model("اَلْعَفُوُّ", "AL-AFUWW", "The Forgiver", "...فَإِنَّ اللّهَ كَانَ عَفُوًّا قَدِيرًا", "...indeed, Allah is ever Pardoning and Competent. [4:149]"),
            new Model("اَلْرَّؤُفُ", "AR-RAOOF", "The Most Kind", "...إِنَّهُۥ بِهِمْ رَءُوفٌۭ رَّحِيمٌۭ", "...Surely He is Ever Gracious and Most Merciful to them. [9:117]"),
            new Model("مَالِكُ الْمُلكِ", "MAALIK-UL-MULK", "The Owner of all Sovereignty", "قُلِ ٱللَّهُمَّ مَـٰلِكَ ٱلْمُلْكِ تُؤْتِى ٱلْمُلْكَ مَن تَشَآءُ وَتَنزِعُ ٱلْمُلْكَ مِمَّن تَشَآء...", "Say, ˹O Prophet,˺ “O Allah! Lord over all authorities! You give authority to whoever You please and remove it from who You please... [3:26]"),
            new Model("ذُو ٱلْجَلَالِ وَٱلْإِكْرَامُ", "DHUL-JALAALI WAL-IKRAAM", "Lord of Majesty and Generosity", "تَبَـٰرَكَ ٱسْمُ رَبِّكَ ذِى ٱلْجَلَـٰلِ وَٱلْإِكْرَامِ", "Blessed is the Name of your Lord, full of Majesty and Honour. [55:78]"),
            new Model("اَلْمُقْسِطُ", "AL-MUQSIT", "The Equitable", "شَهِدَ ٱللَّهُ أَنَّهُۥ لَآ إِلَـٰهَ إِلَّا هُوَ وَٱلْمَلَـٰٓئِكَةُ وَأُو۟لُوا۟ ٱلْعِلْمِ قَآئِمًۢا بِٱلْقِسْطِ ۚ...", "Allah ˹Himself˺ is a Witness that there is no god ˹worthy of worship˺ except Him—and so are the angels and people of knowledge... [3:18]"),
            new Model("اَلْجَامِعُ", "AL-JAAMI", "The Gatherer", "رَبَّنَآ إِنَّكَ جَامِعُ ٱلنَّاسِ لِيَوْمٍۢ لَّا رَيْبَ فِيهِ ۚ...", "Our Lord! You will certainly gather all humanity for the ˹promised˺ Day—about which there is no doubt... [3:9]"),
            new Model("اَلْغَنيُّ", "AL-GHANIYY", "The Self-Sufficient", "...فَإِنَّ اللَّهَ هُوَ الْغَنِيُّ الْحَمِيدُ", "…indeed, Allah is the Free of need (Self Sufficient), the Praiseworthy. [57:24]"),
            new Model("اَلْمُغْنِيُّ", "AL-MUGHNI", "The Enricher", "...وَإِنْ خِفْتُمْ عَيْلَةًۭ فَسَوْفَ يُغْنِيكُمُ ٱللَّهُ مِن فَضْلِهِۦٓ...", "....If you fear poverty, Allah will enrich you out of His bounty... [9:28]"),
            new Model("اَلْمَانِعُ", "AL-MANI", "The Withholder", "لم يرد ذكرها في القرآن.", "Not Mentioned in Quran"),
            new Model("اَلْضَّارُ", "AD-DHARR", "The Distressor", "وَإِن يَمْسَسْكَ ٱللَّهُ بِضُرٍّۢ فَلَا كَاشِفَ لَهُۥٓ إِلَّا هُوَ ۖ...", "If Allah touches you with harm, none can undo it except Him... [6:17]"),
            new Model("اَلْنَّافِعُ", "AN-NAFI", "The Benefactor", "أَوَلَمْ يَرَوْا۟ أَنَّ ٱللَّهَ يَبْسُطُ ٱلرِّزْقَ لِمَن يَشَآءُ وَيَقْدِرُ ۚ إِنَّ فِى ذَٰلِكَ لَـَٔايَـٰتٍۢ لِّقَوْمٍۢ يُؤْمِنُونَ", "Have they not seen that Allah gives abundant or limited provisions to whoever He wills? Surely in this are signs for people who believe. [30:37]"),
            new Model("اَلْنُّورُ", "AN-NUR", "The Light", "ٱللَّهُ نُورُ ٱلسَّمَـٰوَٰتِ وَٱلْأَرْضِ ۚ مَثَلُ نُورِهِۦ كَمِشْكَوٰةٍۢ فِيهَا مِصْبَاحٌ ۖ ٱلْمِصْبَاحُ فِى زُجَاجَةٍ ۖ...", "Allah is the Light of the heavens and the earth. His light1 is like a niche in which there is a lamp, the lamp is in a crystal... [24:35]"),
            new Model("اَلْهَادِي", "AL-HAADI", "The Guide", "...وَإِنَّ ٱللَّهَ لَهَادِ ٱلَّذِينَ ءَامَنُوٓا۟ إِلَىٰ صِرَٰطٍۢ مُّسْتَقِيمٍۢ", "...And Allah surely guides the believers to the Straight Path. [22:54]"),
            new Model("اَلْبَدِيعُ", "AL-BADEE", "The Originator", "بَدِيعُ ٱلسَّمَـٰوَٰتِ وَٱلْأَرْضِ ۖ...", "˹He is˺ the Originator of the heavens and the earth!... [2:117]"),
            new Model("اَلْبَاقِي", "AL-BAAQI", "The Everlasting", "وَيَبْقَىٰ وَجْهُ رَبِّكَ ذُو ٱلْجَلَـٰلِ وَٱلْإِكْرَامِ", "Only your Lord Himself, full of Majesty and Honour, will remain ˹forever˺. [55:27]"),
            new Model("اَلْوَارِثُ", "AL-WAARITH", "The Inheritor of All", "وَإِنَّا لَنَحْنُ نُحْىِۦ وَنُمِيتُ وَنَحْنُ ٱلْوَٰرِثُونَ", "Surely it is We Who give life and cause death. And We are the ˹Eternal˺ Successor... [15:23]"),
            new Model("اَلْرَّشِيدُ", "AR-RASHEED", "The Guide to the Right Path", "لم يرد ذكرها في القرآن.", "Not mentioned in the Quran."),
            new Model("اَلْصَّبُورُ", "AS-SABOOR", "The Patient", "...إِنَّ ٱللَّهَ مَعَ ٱلصَّـٰبِرِينَ", "...Allah is truly with those who are patient. [2:153]"),
    };
    public static final Model[] MUHAMMAD = {
            new Model("مُحَمَّدٌ", "Muhammad", "The Praised One", 0),
            new Model("١َحمَدٌ", "Ahmed", "The Most Praised", 0),
            new Model("حَامِدٌ", "Hamid", "The Praiser", 0),
            new Model("مَحمُودٌ", "Mahmood", "The Most Highly Praised", 0),
            new Model("قَاسِمٌ", "Qasim", "The Distributor", 0),
            new Model("عَاقِبٌ", "Aaqib", "The Last in Succession", 0),
            new Model("فَاتِحٌ", "Faateh", "The Victorious", 0),
            new Model("شَاهِدٌ", "Shahid", "The Witness", 0),
            new Model("حَاشِرٌ", "Hashir", "The Gatherer", 0),
            new Model("رَشِيدٌ", "Rasheed", "The Well Guided", 0),
            new Model("مَشهُودٌ", "Mashhood", "He who is witnessed", 0),
            new Model("بَشِيرٌ", "Basheer", "The Messenger of Good News", 0),
            new Model("نَزِيرٌ", "Nazir", "The Warner", 0),
            new Model("دَاعٍ", "Dai", "The One Who Calls (unto God)", 0),
            new Model("شَافٍ", "Shafi", "The Healer", 0),
            new Model("هَادٍ", "Hadi", "He Who Guides Right", 0),
            new Model("مَهدٍ", "Mahdi", "The Guided One", 0),
            new Model("مَاحٍ", "Mahi", "The Remover (of Disbelief)", 0),
            new Model("مُنجٍ", "Munji", "He Who Saves Delivers", 0),
            new Model("نَاهٍ", "Nahi", "He Who Stops (from bad things)", 0),
            new Model("رَسُولٌ", "Rasool", "The Messenger", 0),
            new Model("نَبِىٌ", "Nabi", "The Prophet", 0),
            new Model("اُمِّيىٌ", "Ummi", "The Unlettered and Illiterate", 0),
            new Model("تِهَامِىٌ", "Tihami", "From Tihama", 0),
            new Model("هَاشَمِىٌ", "Hashmi", "Family Name ,Caste", 0),
            new Model("اَبطَحِىٌ", "Abtahi", "Citizen of Batha", 0),
            new Model("عَزِيزٌ", "Aziz", "The Nobel", 0),
            new Model("حَرِيصٌ عَلَيكُم", "Haris Alaikum", "Full of Concern for You", 0),
            new Model("رَءُوفٌ", "Rauf", "The Compassionate", 0),
            new Model("رَحِيمٌ", "Raheem", "The Mercy-giving", 0),
            new Model("طٰهٰ", "Taha", "Taha (20:1)", 0),
            new Model("مُجتَبٰى", "Mujtaba", "The Chosen One", 0),
            new Model("طٰسٓ", "Taseen", "Tasin (27:1)", 0),
            new Model("مُرتَضٰى", "Murtada", "The Pure (Paak)", 0),
            new Model("حٰمٓ", "Ha-Mim", "Ha-mim (Surah: 40-46)", 0),
            new Model("مُصطَفٰى", "Mustafa", "The Chosen/ Appointed", 0),
            new Model("یٰسٓ", "Yasin", "Yasin (36:1)", 0),
            new Model("اَولىٰ", "Aula", "Most Worthy", 0),
            new Model("مُزّمِّلٌ", "Muzammil", "The Enwrapped", 0),
            new Model("وَلِىٌ", "Wali", "The Friend", 0),
            new Model("مُدَّثِّرٌ", "Muddathir", "One who covers himself with mantle", 0),
            new Model("مَتِينٌ", "Mateen", "The Firm", 0),
            new Model("مُصَدِّقٌ", "Mussadiq", "The Confirmer", 0),
            new Model("طَيِّبٌ", "Tayyib", "The Pious", 0),
            new Model("نَاصِرٌ", "Nasir", "The Helper", 0),
            new Model("مَنصُورٌ", "Mansur", "The Victorious One", 0),
            new Model("مِصبَاحٌ", "Misbah", "The Lamp (Bringer of Light)", 0),
            new Model("اٰمِرٌ", "Aamir", "One who commands", 0),
            new Model("حِجَازِىٌ", "Hijazi", "One who belongs to Hijaz", 0),
            new Model("نَزَارِىٌ", "Nazari", "Nazari", 0),
            new Model("قُريِشِىٌ", "Quraishi", "From the Clan Quraish", 0),
            new Model("مُضَرِىٌ", "Muzarr", "Muzzar", 0),
            new Model("نَبِىُّ التَّوبَة", "Nabi At-Tuba", "The Prophet of Penitence", 0),
            new Model("حَافِظٌ", "Hafiz", "The preserver", 0),
            new Model("كَامِلٌ", "Kamil", "The Completed", 0),
            new Model("صَادِقٌ", "Sadiq", "The Honest", 0),
            new Model("اَمِينٌ", "Amin", "The Trustworthy", 0),
            new Model("عَبدُاللَّهِ", "Abdullah", "Servant of Allah", 0),
            new Model("كَلِيمُ اللَّهِ", "Kalimullah", "He to Whom Allah has Talked", 0),
            new Model("حَبِيبُ اللَّهِ", "Habibullah", "The Beloved of Allah", 0),
            new Model("نَجِىُّ اللَّه", "Najiyullah", "The Confidant of Allah", 0),
            new Model("صَفِىُّ اللَّه", "Safiyullah", "The Intimate of Allah", 0),
            new Model("خَاتِمُ الاَنبِيَآء", "Khatimul Anbiya", "The Last Seal/ End of Seal of All Prophets", 0),
            new Model("حَسِيبٌ", "Haseeb", "The Respected", 0),
            new Model("مُجِيبٌ", "Mujeeb", "The one who accepts", 0),
            new Model("شَكُورٌ", "Shakoor", "The Most grateful", 0),
            new Model("مُقتَصِدٌ", "Muqtasid", "Adopting a middle course", 0),
            new Model("رَسُولُ الرَّحمَةِ", "Rasool ur Rahmat", "The messenger of mercy", 0),
            new Model("قَوِىٌ", "Qawi", "The Strong", 0),
            new Model("حَفِىٌ", "Hafi", "The Well-informed", 0),
            new Model("مَامُونٌ", "Mamoon", "The peaceful", 0),
            new Model("مَعلُومٌ", "Maloom", "One who has knowledge", 0),
            new Model("حَقٌ", "Haqq", "The true man", 0),
            new Model("مُبِينٌ", "Mubeen", "One who clarify", 0),
            new Model("مُطِيعٌ", "Mutee", "The Obedient", 0),
            new Model("اَوَّلٌ", "Awwal", "The First", 0),
            new Model("اٰخِرٌ", "Akhir", "The Last", 0),
            new Model("ظَاهِرٌ", "Zahir", "The manifest", 0),
            new Model("بَاطِنٌ", "Batin", "One who have knowledge of Inner", 0),
            new Model("يَتِيمٌ", "Yateem", "The orphan", 0),
            new Model("كَريِمٌ", "Karim", "The Gracious", 0),
            new Model("حَكِيمٌ", "Hakeem", "The Wise", 0),
            new Model("سَيِّدٌ", "Sayyid", "The Chief", 0),
            new Model("سِرَاجٌ", "Siraj", "One Who has splendour", 0),
            new Model("مُنِيرٌ", "Munir", "One Who Enlightens", 0),
            new Model("مُحَرَّمٌ", "Muharram", "Capable of respect", 0),
            new Model("مُكَرَّمٌ", "Mukarram", "The Honorable", 0),
            new Model("مُبَشِّرٌ", "Mubahsir", "The Bringer of good news", 0),
            new Model("مُزَكِّرٌ", "Mudakir", "The Reminder", 0),
            new Model("مُطَهَّرٌ", "Mutahir", "The Purifier", 0),
            new Model("قَريِبٌ", "Qarib", "The Near", 0),
            new Model("خَلِيلٌ", "Khalil", "The Good friend", 0),
            new Model("مَدعُوٌ", "Maddu", "The Called One", 0),
            new Model("جَوَّادٌ", "Jawwad", "The Generous", 0),
            new Model("خَاتِمٌ", "Khatim", "The Seal (Final Prophet)", 0),
            new Model("عَادِلٌ", "Aadil", "One who gives verdict", 0),
            new Model("شَهِيرٌ", "Shahir", "The Famous", 0),
            new Model("شَهِيدٌ", "Shaheed", "The Witnesser", 0),
            new Model("رَسُولُ المَلاَحِمِ", "Rasool Al Malahim", "The Messenger of Fierce Battles", 0),
    };
    public static final Model[] menu = {
            new Model(R.drawable.khaba, "Asma Ul Husna"),
            new Model(R.drawable.madina, "Asma Ul Rasool"),
            new Model(R.drawable.tasbeeh, "Tasbeeh"),
    };

    private String ALLAH_NAMES_ARABIC;
    private String ALLAH_NAMES_ENGLISH;
    private String ALLAH_NAMES_MEANING;
    private String ALLAH_NAMES_REFERENCE_ARABIC;
    private String ALLAH_NAMES_REFERENCE_ENGLISH;
    private String MUHAMMAD_NAMES_ARABIC;
    private String MUHAMMAD_NAMES_ENGLISH;
    private String MUHAMMAD_NAMES_MEANING;
    private int justValue;
    private int IMAGE_ID;
    private String MENU_NAME;


    public Model(int IMAGE_ID, String MENU_NAME) {
        this.IMAGE_ID = IMAGE_ID;
        this.MENU_NAME = MENU_NAME;
    }

    public Model(String ALLAH_NAMES_ARABIC, String ALLAH_NAMES_ENGLISH, String ALLAH_NAMES_MEANING, String ALLAH_NAMES_REFERENCE_ARABIC, String ALLAH_NAMES_REFERENCE_ENGLISH) {
        this.ALLAH_NAMES_ARABIC = ALLAH_NAMES_ARABIC;
        this.ALLAH_NAMES_ENGLISH = ALLAH_NAMES_ENGLISH;
        this.ALLAH_NAMES_MEANING = ALLAH_NAMES_MEANING;
        this.ALLAH_NAMES_REFERENCE_ARABIC = ALLAH_NAMES_REFERENCE_ARABIC;
        this.ALLAH_NAMES_REFERENCE_ENGLISH = ALLAH_NAMES_REFERENCE_ENGLISH;
    }

    public Model(String MUHAMMAD_NAMES_ARABIC, String MUHAMMAD_NAMES_ENGLISH, String MUHAMMAD_NAMES_MEANING, int justValue) {
        this.MUHAMMAD_NAMES_ARABIC = MUHAMMAD_NAMES_ARABIC;
        this.MUHAMMAD_NAMES_ENGLISH = MUHAMMAD_NAMES_ENGLISH;
        this.MUHAMMAD_NAMES_MEANING = MUHAMMAD_NAMES_MEANING;
        this.justValue = justValue;
    }

    public String getALLAH_NAMES_REFERENCE_ARABIC() {
        return ALLAH_NAMES_REFERENCE_ARABIC;
    }

    public String getALLAH_NAMES_REFERENCE_ENGLISH() {
        return ALLAH_NAMES_REFERENCE_ENGLISH;
    }

    public String getMUHAMMAD_NAMES_MEANING() {
        return MUHAMMAD_NAMES_MEANING;
    }

    public String getALLAH_NAMES_MEANING() {
        return ALLAH_NAMES_MEANING;
    }

    public String getMUHAMMAD_NAMES_ENGLISH() {
        return MUHAMMAD_NAMES_ENGLISH;
    }

    public String getMUHAMMAD_NAMES_ARABIC() {
        return MUHAMMAD_NAMES_ARABIC;
    }

    public String getALLAH_NAMES_ENGLISH() {
        return ALLAH_NAMES_ENGLISH;
    }


    public String getMENU_NAME() {
        return MENU_NAME;
    }


    public int getIMAGE_ID() {
        return IMAGE_ID;
    }


    public String getALLAH_NAMES_ARABIC() {
        return ALLAH_NAMES_ARABIC;
    }
}


