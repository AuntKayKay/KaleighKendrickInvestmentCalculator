package westga.edu.kaleighkendrickinvestmentcalculator;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityTests extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTests() {
        super(MainActivity.class);
    }

    //The test verifies that we configured our app and test code correctly.
    public void testActivityExists() {
        MainActivity activity = getActivity();
        assertNotNull(activity);
    }

    public void testNull() {
        MainActivity activity = getActivity();

        //Tap button
        // ----------------------

        Button button =
                (Button) activity.findViewById(R.id.button2);

        TouchUtils.clickView(this, button);

        // Verify calculation
        // ----------------------

        TextView calculation = (TextView) activity.findViewById(R.id.answer);
        String actualText = calculation.getText().toString();
        assertEquals(" $1.00", actualText);
    }

    public void testValuePayment() {
        MainActivity activity = getActivity();

        //Tap button
        // ----------------------

        Button button =
                (Button) activity.findViewById(R.id.button2);

        TouchUtils.clickView(this, button);

        // Verify calculation
        // ----------------------

        TextView calculation = (TextView) activity.findViewById(R.id.paymentImput);
        String actualText = calculation.getText().toString();
        assertEquals("1", actualText);
    }

    public void testValueRate() {
        MainActivity activity = getActivity();

        //Tap button
        // ----------------------

        Button button =
                (Button) activity.findViewById(R.id.button2);

        TouchUtils.clickView(this, button);

        // Verify calculation
        // ----------------------

        TextView calculation = (TextView) activity.findViewById(R.id.rateImput);
        String actualText = calculation.getText().toString();
        assertEquals("1", actualText);
    }

    public void testValuePeriod() {
        MainActivity activity = getActivity();

        //Tap button
        // ----------------------

        Button button =
                (Button) activity.findViewById(R.id.button2);

        TouchUtils.clickView(this, button);

        // Verify calculation
        // ----------------------

        TextView calculation = (TextView) activity.findViewById(R.id.periodImput);
        String actualText = calculation.getText().toString();
        assertEquals("1", actualText);
    }


}