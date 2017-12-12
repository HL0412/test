package com.hl;
import java.util.*;
class Student{
	String name;
	int grade;
	public Student(String name,int grade){
		this.name=name;
		this.grade=grade;
	}
	public Student(){
		name="";
		grade=0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	 
}
public class List{
	public static void main(String[] args){
		 LinkedList <Student>list=new LinkedList<Student>();
		 //创建LinkedList集合对象，且对象属于类Studet;添加学生信息
		 list.add(new Student("张小明",86));
			list.add(new Student("刘志强",91));
			list.add(new Student("李云环",72));
			list.add(new Student("孙志华",86));
			list.add(new Student("唐德凯",84));
			list.add(new Student("杜天",82));
			list.add(new Student("张禹",86));
			Student s=new Student("王琳",86);
			Iterator<Student> it=list.iterator();//迭代器遍历所有学生信息
			System.out.println("新学生―――"+s.name+"的托福成绩"+"("+s.grade+")"+"与下列学生：");
			while(it.hasNext()){
				Student student=(Student)it.next();
				if(student.grade==s.grade){
					System.out.println(student.name+"("+student.grade+")");
				}
				 
			}
			System.out.println("的托福成绩相同");
		}
	}
