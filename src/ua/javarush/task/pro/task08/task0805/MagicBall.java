package ua.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Безперечно";
    private static final String DEFINITELY = "Безумовно, так";
    private static final String MOST_LIKELY = "Найймовірніше";
    private static final String OUTLOOK_GOOD = "Хороші перспективи";
    private static final String ASK_AGAIN_LATER = "Запитай пізніше";
    private static final String TRY_AGAIN = "Спробуй ще";
    private static final String NO = "Моя відповідь — ні";
    private static final String VERY_DOUBTFUL = "Вельми сумнівно";

    public static String getPrediction() {
        //напишіть тут ваш код
        Random random = new Random();
        String[] version = {CERTAIN, DEFINITELY, MOST_LIKELY, OUTLOOK_GOOD, ASK_AGAIN_LATER, TRY_AGAIN, NO, VERY_DOUBTFUL};
        int answer = random.nextInt(version.length);
        if (answer >= 0 && answer <= 7) {
            return version[answer];
        } else {
            return null;
        }
    }
}
