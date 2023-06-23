package tests;

import org.testng.annotations.Test;

public class DroppableTests extends BaseTest{
    @Test
    public void verifyThatDragMeElementIsDraggedToDropMeElement(){
        getDroppable().open();
        clickOnElement(getDroppable().getSimpleBtn());
        dragAndDrop(getDroppable().getDragMe(),getDroppable().getDropMe());
        assertVisibilityOfElement(getDroppable().getDropped());
    }

}
