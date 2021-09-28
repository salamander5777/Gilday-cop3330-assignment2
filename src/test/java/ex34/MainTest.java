package ex34;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void employeeList() {
        int employeeCount = 5;

        String[] array = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        System.out.print("There are " + employeeCount + " employees: \n" + array[0] + "\n" +  array[1] + "\n" + array[2] + "\n" + array[3] + "\n" + array[4]);
        String[] employeeListNew = new String[array.length - 1];
        String input_question = "John Smith";
        System.out.print("\n\nWe are removing " + input_question + " from the employee list.\n\n");
        if(input_question.matches("John Smith")){
            employeeCount = 4;
            for(int i = 0, r = 0; i < 5; i++){
                if (i == 0){
                    continue;
                }
                employeeListNew[r++] = array[i];
            }
        }
        else if(input_question.matches("Jackie Jackson")){
            employeeCount = 4;
            for(int i = 0, r = 0; i < 5; i++){
                if (i == 1){
                    continue;
                }
                employeeListNew[r++] = array[i];
            }
        }
        else if(input_question.matches("Chris Jones")){
            employeeCount = 4;
            for(int i = 0, r = 0; i < 5; i++){
                if (i == 2){
                    continue;
                }
                employeeListNew[r++] = array[i];
            }
        }
        else if(input_question.matches("Amanda Cullen")){
            employeeCount = 4;
            for(int i = 0, r = 0; i < 5; i++){
                if (i == 3){
                    continue;
                }
                employeeListNew[r++] = array[i];
            }
        }
        else if(input_question.matches("Jeremy Goodwin")){
            employeeCount = 4;
            for(int i = 0, r = 0; i < 5; i++){
                if (i == 4){
                    continue;
                }
                employeeListNew[r++] = array[i];
            }
        }

        if(!input_question.matches("Jeremy Goodwin") && !input_question.matches("Amanda Cullen") && !input_question.matches("Chris Jones") && !input_question.matches("Jackie Jackson") && !input_question.matches("John Smith")){
            System.out.print("There are " + employeeCount + " employees: \n" + array[0] + "\n" +  array[1] + "\n" + array[2] + "\n" + array[3] + "\n" + array[4]);
        }
        else{
            System.out.print("\nThere are " + employeeCount + " employees:\n" + employeeListNew[0] +  "\n" + employeeListNew[1] + "\n" + employeeListNew[2] + "\n" + employeeListNew[3]);
        }
    }
}