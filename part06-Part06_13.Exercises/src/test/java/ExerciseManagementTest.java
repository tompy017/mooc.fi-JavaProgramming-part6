import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;




public class ExerciseManagementTest {
    
    private ExerciseManagement management;
    
    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }
    
    
    /*
    public ExerciseManagementTest() {
        
    }
    */
    
    @Test
    public void excerciseListEmptyAtBeginning() {
        //ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowsListByOne() {
        //ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }
    
    
    @Test
    public void addedExerciseInList() {
        //ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }
    
    @Test
    public void exercisesCanBeMarkedAsCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }
    
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertFalse(management.isCompleted("Some exercise"));
    }
    
    
}
