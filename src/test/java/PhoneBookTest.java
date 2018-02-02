import org.junit.Assert;
import org.junit.Test;

public class PhoneBookTest {


    @Test
public void addTest(){
        //Given
        PhoneBook pb = new PhoneBook();
       String expected = "302-678-7685";

        //When
        pb.add("Mike", "302-678-7685");
       String actual = pb.lookUp("Mike");

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void lookUpTest(){
        //Given
        PhoneBook pb = new PhoneBook();
        pb.add("Mom", "302-555-6655");
        String expected = "302-555-6655";


        //When
        String actual = pb.lookUp("Mom");


        //Then
        Assert.assertEquals(expected, actual);
    }

   @Test
    public void removeEntries() {
        //Given
        PhoneBook pb = new PhoneBook();
        pb.add("Dad", "302- 444-9900");

        //When
        pb.removeEntries("Dad");
        String expected = null;


        //Then
       Assert.assertNull(expected);
    }

  @Test
    public void listAllEntries() {
        //Given
        PhoneBook pb = new PhoneBook();
        pb.add("MumMum", "856-777-3322");
        pb.add("PopPop", "856-777-8989");
        String expected = "[PopPop=856-777-8989, MumMum=856-777-3322]";

        //When
        String actual = pb.toString();

        //Then
        Assert.assertEquals(expected, actual);
    }

   @Test
    public void reverseLookUp() {
        //Given
        PhoneBook pb = new PhoneBook();
        pb.add("Mom", "302-555-6655");
        String expected = "Mom";

        //When
        String actual = pb.reverseLookUp("302-555-6655");


        //Then
        Assert.assertEquals(expected, actual);
    }
}
