package practicum7;

import java.text.BreakIterator;
import java.util.Locale;

public class OnderelkaarProces implements OpmaakProces {
    public OnderelkaarProces() {}

    public String maakOp(String input) {
        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
        iterator.setText(input);
        int start = iterator.first();
        for (int end = iterator.next();
             end != BreakIterator.DONE;
             start = end, end = iterator.next()) {
            System.out.println(input.substring(start, end));
        }
        return "";
    }
}