class Students
{
    private int id;
    private String firstName;
    private String lastName;
    private String major;

    public int getId()
    {
        return this.id;
    }

    public void setId(int stud_id)
    {
        this.id = stud_id;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public void setFirstName(String fnm)
    {   
        this.firstName = fnm;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public void setLastName(String lnm)
    {
        this.lastName = lnm;
    }

    public String getMajor()
    {
        return this.major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }
}