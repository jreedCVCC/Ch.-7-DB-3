import java.util.Scanner;

public class AccountValidation {
    private int account;
    private int[] accountList = {
            5658845, 4520125, 7895122,
            8777541, 8451277, 1302850,
            8080152, 4562555, 5552012,
            5050552, 7825877, 1250255,
            1005231, 6545231, 3852085,
            7576651, 7881200, 4581002
    };
    public AccountValidation(int x) {
        account = x;
    }
    public void sortList() {
        int minIndex, minValue;
        for (int i = 0; i < accountList.length - 1; i++) {
            minIndex = i;
            minValue = accountList[i];
            for (int j = i + 1; j < accountList.length; j++) {
                if (accountList[j] <= minValue) {
                    minValue = accountList[j];
                    minIndex = j;
                }
            }
            accountList[minIndex] = accountList[i];
            accountList[i] = minValue;
        }
    }

    public boolean isValid() {
        boolean flag = false;
        int first = 0;
        int last = accountList.length;

        while (!flag && first <= last) {
            int middle = (first + last) / 2;
            if (account == accountList[middle]) {
                flag = true;
            } else if (account > accountList[middle]) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }
        return flag;
    }

}
