package StudentDemo;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by xu on 18/4/14.
 */
public class StreamMain {
    public static void main(String[] args) {
        List<Student> students = register();
        System.out.println(students);

        //Total number of students
        int studentCount = (int) students.stream()
                //.count();
                .mapToLong(s -> 1L)
                .sum();
        log("Total of students is :",studentCount);

        //Total credits
        long totalCredits = students.stream()
                .mapToLong(Student::getCredit)
                // .sum();
                .reduce(0,Long::sum);
        log("Total credits is : ",totalCredits);

        //Student number by gender
        Map<Student.Gender,Long> groupCountByGender = students.stream()
                .collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
        log("Student number by gender",groupCountByGender);

        Double creditAvg = students.stream()
                .collect(Collectors.averagingDouble(Student::getCredit));
        log("Credit average",creditAvg);

        LongSummaryStatistics creditStats =students.stream()
                .map(Student::getCredit)
                .collect(LongSummaryStatistics::new,
                        LongSummaryStatistics::accept,
                        LongSummaryStatistics::combine);
        log("Stats: " , creditStats);

        LongSummaryStatistics creditStats2 = students.stream()
                .collect(Collectors.summarizingLong(Student::getCredit));
        log("Stats: ",creditStats2);

        Map<Long,String> idNameMap = students.stream()
                .collect(Collectors.toMap(Student::getId,Student::getName));
        log("<Id,Name> :",idNameMap);

        String names = students.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", ","Dahrma2018 ","!GoodJob"));
        log("names: ",names);

        Optional<Student> hasFemale = students.stream()
                .filter(Student::isFemale)
                .findAny();
        if (hasFemale.isPresent()){
            log("Yes,we have female students :",hasFemale.get().getName());
        }else {
            log("No,we have only male students ","");
        }

    }
    private static void log(String prefix,Object content){
        System.out.println(prefix + content);
    }
    private static List<Student> register(){
        Student s1 = new Student(1L,"FeiZhen", Student.Gender.MALE,100, LocalDate.of(2000,Month.APRIL,27), Student.Department.CS);
        Student s2 = new Student(2L,"LiuYuHao", Student.Gender.MALE,1, LocalDate.of(2000,Month.APRIL,27), Student.Department.EE);
        Student s3 = new Student(3L,"WangRu", Student.Gender.FEMALE,80, LocalDate.of(2000,Month.FEBRUARY,3), Student.Department.EL);
        Student s4 = new Student(4L,"WenJiaChen", Student.Gender.MALE,59, LocalDate.of(2000,Month.FEBRUARY,9), Student.Department.AM);
        Student s5 = new Student(5L,"FanChuang", Student.Gender.MALE,100, LocalDate.of(2000,Month.JULY,5), Student.Department.CS);
        Student s6 = new Student(6L,"JiaBin", Student.Gender.MALE,60, LocalDate.of(2000,Month.OCTOBER,7), Student.Department.CS);
        Student s7 = new Student(7L,"DongDaHai", Student.Gender.MALE,99, LocalDate.of(2000,Month.JUNE,18), Student.Department.AM);
        Student s8 = new Student(8L,"LuoMing", Student.Gender.MALE,80, LocalDate.of(2000,Month.AUGUST,11), Student.Department.EE);
        Student s9 = new Student(9L,"YangMin", Student.Gender.MALE,70, LocalDate.of(2000,Month.FEBRUARY,21), Student.Department.AM);
        Student s10 = new Student(10L,"ZhangGuoHua", Student.Gender.MALE,89, LocalDate.of(2000,Month.MARCH,9), Student.Department.CS);
        Student s11 = new Student(11L,"GuZhuangZhuang", Student.Gender.MALE,99, LocalDate.of(2000,Month.NOVEMBER,2), Student.Department.CS);


        return Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);
    }

}
