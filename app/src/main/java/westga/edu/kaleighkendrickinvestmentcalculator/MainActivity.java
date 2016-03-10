package westga.edu.kaleighkendrickinvestmentcalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.DecimalFormat;

import westga.edu.kaleighkendrickinvestmentcalculator.model.InvestmentCalculator;


public class MainActivity extends AppCompatActivity {

    public void onButtonClick(View v){
        InvestmentCalculator invest = new InvestmentCalculator();
        TextView payment =
                (TextView) findViewById(R.id.paymentImput);
        if(this.helperNotNull(payment)){
            invest.setPaymentAmount(Double.parseDouble(payment.getText().toString()));
        } else{
            invest.setPaymentAmount(1);
            payment.setText(""+1);
        }

        TextView rate =
                (TextView) findViewById(R.id.rateImput);
        if(this.helperNotNull(rate)){
            invest.setRatePeriod(Double.parseDouble(rate.getText().toString()));
        } else{
            invest.setRatePeriod(1);
            rate.setText(""+1);
        }
        TextView period =
                (TextView) findViewById(R.id.periodImput);
        if(this.helperNotNull(period)){
            invest.setPeriod(Double.parseDouble(period.getText().toString()));
        } else{
            invest.setPeriod(1);
            period.setText(""+1);
        }
        TextView answer=
                (TextView) findViewById(R.id.answer);
        invest.calculateAnnuity();
        DecimalFormat df = new DecimalFormat("#.00");
        answer.setText(" $"+df.format(invest.getPeriodicPayment()));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private boolean helperNotNull(TextView num){
        if(TextUtils.isEmpty(num.getText().toString()) || Double.parseDouble(num.getText().toString()) == 0){
            return false;
        } else {
            return true;
        }
    }
}
