package day0308;

class BoardDTO {
    private String writer;
    private String subject;

    BoardDTO() {}

    public BoardDTO(String writer, String subject) {
        this.writer = writer;
        this.subject = subject;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

// 데이터 처리에 대한 할일을 미리 인터페이스로 만든다
interface BoardDAOInter {
    public void insert(BoardDTO dto);
    public void delete(String writer);
    public void list();
    public void update(String writer);

}

// dao class(data access object: 데이타 로직 처리를 위한 클래스(CRUD))
class BoardDAO implements BoardDAOInter {
    @Override
    public void insert(BoardDTO dto) {
        System.out.println(dto.getWriter() + "의 글" + dto.getSubject() + "를 추가함");
    }

    @Override
    public void delete(String writer) {
        System.out.println(writer + "의 글을 삭제");
    }

    @Override
    public void list() {
        System.out.println("전체 게시글 삭제");
    }

    @Override
    public void update(String writer) {
        System.out.println(writer + "님의 글을 수정합니다");
    }
}

public class Ex7Interface {
    public static void main(String[] args) {
        BoardDAOInter dao = new BoardDAO();

        dao.insert(new BoardDTO("아무개", "안녕하세요"));
        dao.delete("아무개");
        dao.list();
        dao.update("아무개");
    }
}
