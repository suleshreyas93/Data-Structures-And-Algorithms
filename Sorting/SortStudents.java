class SortStudents
{
    private Students[] stud_arr;
    private int size;

    public SortStudents(int maxSize)
    {
        stud_arr = new Students[maxSize];
        size = 0;
    }

    public void insert(Students student)
    {
        stud_arr[size] = student;
        size++;
    }

    public void display()
    {
        System.out.print(stud_arr[i].getId()+" "+stud_arr[i].getFirstName()+" "+stud_arr[i].getLastName());
    }
}