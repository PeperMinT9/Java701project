package day0310;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class HW1 {
    static final String FILENAME = "C:\\Users\\Admin\\Documents\\bit701naver\\javawork\\emp.txt";
    Scanner sc = new Scanner(System.in);
    List<EmpDTO> list = new Vector<>();

    public HW1() {
        empReader();
    }

    public void empReader() {
        FileReader fr = null;
        BufferedReader br = null;
        String rl;
        String[] data;
        try {
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            while(true) {
                rl = br.readLine();
                if(rl == null) break;
                data = rl.split(",");
                EmpDTO dto = new EmpDTO(data[0], data[1].trim(), Integer.parseInt(data[2].trim()), data[3].trim());
                list.add(dto);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void empAdd() {
        String name, part, pn;
        int year;

        System.out.println("** 사원 추가 **");
        System.out.println("이름을 입력해주세요");
        name = sc.nextLine();
        System.out.println("부서를 입력해주세요");
        part = sc.nextLine();
        System.out.println("나이를 입력해주세요(정수값)");
        year = Integer.parseInt(sc.nextLine());
        System.out.println("휴대폰 번호를 입력해주세요(정수값)");
        pn = sc.nextLine();

        EmpDTO dto = new EmpDTO(name, part, year, pn);
        list.add(dto);
    }

    public void empFind() {
        System.out.println("검색할 이름을 알려주세요");
        String finder = sc.nextLine();

        for(EmpDTO dto: list) {
            if(dto.getName().equals(finder)) {
                System.out.printf("%s\t%s\t%d\t%s\n", dto.getName(), dto.getPart(), dto.getYear(), dto.getPn());
            }
        }
    }

    public void empDel() {
        System.out.println("삭제할 이름을 알려주세요");
        String del = sc.nextLine();

        int ls = list.size();
        for(int i = ls - 1; i >= 0; i--) {
            if(list.get(i).getName().equals(del)) {
                list.remove(i);
            }
        }
    }

    public void empFindPart() {
        System.out.println("검색할 부서를 알려주세요");
        String finder = sc.nextLine();

        for(EmpDTO dto: list) {
            if(dto.getPart().equals(finder)) {
                System.out.printf("%s\t%s\t%d\t%s\n", dto.getName(), dto.getPart(), dto.getYear(), dto.getPn());
            }
        }

    }

    public void empReadAll() {
        int arr_length = list.size();
        System.out.println("이름\t부서\t나이\t핸드폰");
        for(int i = 0; i < arr_length; i++) {
            System.out.printf("%s\t%s\t%d\t%s\n", list.get(i).getName(), list.get(i).getPart(), list.get(i).getYear(), list.get(i).getPn());
        }
    }

    public void empSave() {
        FileWriter fw = null;
        try {
            fw = new FileWriter(FILENAME);

            for(EmpDTO dto: list) {
                fw.write(dto.getName() + "," + dto.getPart() + "," + dto.getYear() + "," + dto.getPn() + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fw.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public int getMenu() {
        int menu = -1;
        System.out.println("1. 사원추가   2. 사원검색   3. 사원삭제   4. 부서명 검색   5. 전체출력   6. 종료");
        try {
            menu = Integer.parseInt(sc.nextLine());
        }
        catch (NumberFormatException e) {
            menu = 2;
        }

        return menu;
    }

    public static void main(String[] args) {
        HW1 hw = new HW1();

        Exit:
        while(true) {
            switch (hw.getMenu()) {
                case 1:
                    hw.empAdd();
                    break;
                case 2:
                    hw.empFind();
                    break;
                case 3:
                    hw.empDel();
                    break;
                case 4:
                    hw.empFindPart();
                    break;
                case 5:
                    hw.empReadAll();
                    break;
                default:
                    hw.empSave();
                    break Exit;
            }
        }
    }
}
