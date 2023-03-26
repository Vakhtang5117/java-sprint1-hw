public class MonthData {
    int days[] = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println(i + " День: " + days[i]);
        }
    }

    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps = sumSteps + days[i];
        }
        return sumSteps;
    }

    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxSteps) {
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 1; i < days.length; i++) {
            if (days[i] >= days[i - 1] && days[i] >= goalByStepsPerDay) {
                currentSeries++;
            } else {
                currentSeries = 0;
            }if(currentSeries > finalSeries){
                finalSeries = currentSeries;
            }

        }
        return finalSeries;
    }


//        int sumSteps = 0;
//        int maxSteps = 0;
//        int countOfDay =
//        for (int i = 0; i < days.length; i++) {
//            sumSteps = sumSteps + days[i];
//            if (days[i] > maxSteps){
//                maxSteps = days[i];
}





