/**
  * Created by steve on 2/9/2017.
  */
class clsShane {

  private[this] var _fname: String = ""

  def fname: String = _fname

  def fname_=(value: String): Unit = {
    _fname = value
  };
  private[this] var _lname: String = ""

  def lname: String = _lname

  def lname_=(value: String): Unit = {
    _lname = value
  };

  def fn_showFullName(firstname: String, lastname: String): Unit ={
    lname = lastname;
    fname = firstname;

    //-- Call my Inner Class to get Parent Information.
    val x = new ShaneParentInfo();
    println(x.dadFullName);

    println(fname + " " + lname);
  }




  class ShaneParentInfo{
    def dadFullName: String = "Russell Shane";
    def momFullName: String = "Pat Shane";

  }


}
