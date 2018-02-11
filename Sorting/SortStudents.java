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

    public void sortStudentsByLastName()
    {
        int out,in;
        Students temp;
        for(out = 1; out < size; out++)
        {
            temp = stud_arr[out];
            in = out;
            while(in > 0 && stud_arr[in - 1].getLastName().compareToIgnoreCase(temp.getLastName()) > 0)
            {
                stud_arr[in] = stud_arr[in - 1];
                in--;
            }
            stud_arr[in] = temp;
        }
    }

    public void display()
    {
        for(int i = 0; i < size; i++)
        {
            System.out.print(stud_arr[i].getId()+"\t\t"+stud_arr[i].getFirstName()+"\t\t\t  "+stud_arr[i].getLastName()+"\t\t    "+stud_arr[i].getMajor());
            System.out.println();
        }
        
    }
}