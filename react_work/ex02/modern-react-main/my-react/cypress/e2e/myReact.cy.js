describe('Cypress Sample', () => {
  it('MyReact App Test', () => {
    // 홈페이지 바로가기
    cy.visit('/');

    // 도서 등록 양식으로 이동하여 아무것도 입력하지 않고 [등록하기] 버튼을 클릭한다.
    cy.get('a[href="/book/form"]').click();
    cy.get('[type="submit"]').click();
    cy.get('ul').should('have.length', 2);

    // 도서명, 가격(잘못된 값)을 입력한 상태에서 [등록하기] 버튼을 클릭한다.
    cy.get('#title').type('모험의 서');
    cy.get('#price').type('-18000');
    cy.get('[type="submit"]').click();
    cy.get('form li:eq(0)').should('contain', '양수');

    // 모든 항목에 올바른 값을 입력한 후 [등록하기] 버튼을 클릭한다.
    cy.get('#price').clear().type('18000');
    cy.get('#published').type('2024-02-29');
    cy.get('[type="submit"]').click();
    cy.url().should('equal', 'http://localhost:3000/');
  });
});