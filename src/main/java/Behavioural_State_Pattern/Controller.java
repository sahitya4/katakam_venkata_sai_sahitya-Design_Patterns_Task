package Behavioural_State_Pattern;

public class Controller
{

        public static Accounting acct;
        public static Sales sales;


        private static Bank con;

        Controller() {
            acct = new Accounting();
            sales = new Sales();

        }

        public void setAccountingConnection() {
            con = acct;
        }
        public void setSalesConnection() {
            con  = sales;
        }

        public void open() {
            con .open();
        }
        public void close() {
            con .close();
        }




}
