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
		 //����LinkedList���϶����Ҷ���������Studet;���ѧ����Ϣ
		 list.add(new Student("��С��",86));
			list.add(new Student("��־ǿ",91));
			list.add(new Student("���ƻ�",72));
			list.add(new Student("��־��",86));
			list.add(new Student("�Ƶ¿�",84));
			list.add(new Student("����",82));
			list.add(new Student("����",86));
			Student s=new Student("����",86);
			Iterator<Student> it=list.iterator();//��������������ѧ����Ϣ
			System.out.println("��ѧ���D�D�D"+s.name+"���и��ɼ�"+"("+s.grade+")"+"������ѧ����");
			while(it.hasNext()){
				Student student=(Student)it.next();
				if(student.grade==s.grade){
					System.out.println(student.name+"("+student.grade+")");
				}
				 
			}
			System.out.println("���и��ɼ���ͬ");
		}
	}
