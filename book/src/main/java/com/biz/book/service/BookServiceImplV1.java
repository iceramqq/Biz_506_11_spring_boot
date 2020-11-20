package com.biz.book.service;

import com.biz.book.domain.BookVO;
import com.biz.book.pesistence.BookRespository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("bookServiceV1")
public class BookServiceImplV1 implements BookService{

    private final BookRespository bookDao;
    public BookServiceImplV1(BookRespository bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public List<BookVO> selelecAll() {
        List<BookVO> bookList = bookDao.findAll();
        return bookList;
    }

    /**
     * 데이터가
     *
     * if
     *
     *
     * 어떤 객체의 저장된 값이 null인가를 비교하는 것을
     * 사용하지 않기 위해서 새롭게
     */
    @Override
    public BookVO findById(Long id) {
        Optional<BookVO> bookVO = bookDao.findById(id);

        // 만약 findById() 수행하여 데이터가 없으면
        // 새로운 vo를 만들고 id값을 -1로 세팅하여 리턴하라
        // return bookVO.orElse(BookVO.builder().id(-1L).build());
        return bookVO.get();
    }

    @Override
    public int insert(BookVO bookVO) {
        bookDao.save(bookVO);
        return 0;
    }

    @Override
    public int update(BookVO bookVO) {
        bookDao.save(bookVO);
        return 0;
    }

    @Override
    public int delete(Long id) {
        bookDao.deleteById(id);
        return 0;
    }
}
