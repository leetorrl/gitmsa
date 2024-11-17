import { Outlet } from 'react-router-dom';
import { MyLink } from './MyLink';

export default function RouterCustom() {
  return (
    <>
      {/* 자체 제작 링크로 메뉴 부분 대체 */}
      <ul>
        <li><MyLink to="/">홈</MyLink></li>
        <li><MyLink to="/article">기사</MyLink></li>
        <li><MyLink to="/about">회사 소개</MyLink></li>
      </ul>
      <hr />
      <Outlet />
    </>
  );
}