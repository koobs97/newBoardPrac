package com.ProjectGroup.Practice.Domain.TextArea;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
/*

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class TextArea {
    //TODO GenerationType.IDENTITY  --> jpa는 hibernate의 sequence 를 사용해서 자동 할당  ///////////////이거랑
    //TODO  GenerationType.AUTO --> 사용하고자 하려는 데이터베이스의 기본 id 생성 전략을 사용 (jpa 기준) //////이거 추천
    //TODO GenerationType.Sequence --> 데이터 베이스 sequence
    //TODO GenerationType.Table ---> Table 마다 sequence 적용.
    //TODO @Nullable 엔티티 키 값의 null 허용
    //TODO @Basic(fetch = FetchType.LAZY)
    //    @Formula(Native query)
    //TODO  @Embedded(주인) @Embeddable(강아지) --> 주인이 강아지만 데리고 쓸일이 많아. 근데 멤버 변수 내용이 너무 많아.  이럴떄 강아지를 엔티티로만들고 Embeddable
    //TODO 1. TextArea ( 회원 비회원 둘다 적용할 수 있도록 엔티티 조금 수정, 절대 클래스를 더 만들지 말것. )
    //TODO 2. Member 도메인(Entity) 작성 오픈소스 봐도 됨. 단! 어노테이션은 직접 매핑할것 (클래스 추가).
    @Id  //TODO PK
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long Textarea_id;

    @Column( name = "title")
    private String title;

    @Enumerated(value = EnumType.STRING)
    @Column( name = "writer" )
    private String writer;

    @Lob
    private String conTent;

    @Column( name = "viewcount")
    private Integer viewCount;

    @Column( name = "create_date")
    @DateTimeFormat( pattern = "yyyy-mm-dd")
    private LocalDateTime createDate;

    @Enumerated( value = EnumType.STRING )
    @Column(name = "category")
    private Category category;

}


 */