package quick_tasks;
/*
1. StackOverFlowError
2. NPE?
3. Зависнет
4. Успешно завершит метод
 */
public class VI_Finally {
    private void work(){
        try{
            work();
        } finally {
            work();
        }
    }
}
/*
Логично что будет SOFE, потому что бесконечная рекурсия, но!
получив SOFE Java попытается выполнить finally, потому что так положено.
Снова получит SOFE, снова пойдет выполнять finally и так до бесконечности
 */