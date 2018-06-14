package demjanov.av.ru.mvp_app;

public class Presenter {
    private Model mModel;
    private MainActivity view;
    public Presenter(MainActivity view){
        this.mModel = new Model();
        this.view = view;
    }
    private int calcNewModelValue(int modelElementIndex){
        int currentValue = mModel.getElementValueAtIndex(modelElementIndex);
        return currentValue + 1;
    }
    public void buttonClick(int btnIndex){
        int newModelValue = calcNewModelValue(btnIndex - 1);
        mModel.setElementValueAtIndex(btnIndex - 1, newModelValue);
        view.setButtonText(btnIndex, newModelValue);
        
    }

}
