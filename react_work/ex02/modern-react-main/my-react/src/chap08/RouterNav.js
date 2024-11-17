import { NavLink, Outlet } from 'react-router-dom';
import './RouterNav.css';

export default function RouterNav() {
  return (
    <>
      <ul>
        <li><NavLink to="/">홈</NavLink></li>
        <li><NavLink to="/article">기사</NavLink></li>
        <li><NavLink to="/about">회사 소개</NavLink></li>
      </ul>
      <hr />
      <Outlet />
    </>
  );
}



// Code 8-2-8
// import { NavLink, Outlet } from 'react-router-dom';
// import './RouterNav.css';

// const isCurrent = ({ isActive, isPending }) => isActive ? 'active' : '';

// export default function RouterNav() {
//   return (
//     <>
//       <ul>
//         <li><NavLink className={isCurrent} to="/">홈</NavLink></li>
//         <li><NavLink className={isCurrent} to="/article">기사</NavLink></li>
//         <li><NavLink className={isCurrent} to="/about">회사 소개</NavLink></li>
//       </ul>
//       <hr />
//       <Outlet />
//     </>
//   );
// }



// Code 8-2-9
// import { NavLink, Outlet } from 'react-router-dom';
// import './RouterNav.css';

// const isCurrent = ({ isActive }) => isActive ? {
//   color: 'Red',
//   fontWeight: 'bold'
// } : {};

// export default function RouterNav() {
//   return (
//     <>
//       <ul>
//         <li><NavLink style={isCurrent} to="/">홈</NavLink></li>
//         <li><NavLink style={isCurrent} to="/article">기사</NavLink></li>
//         <li><NavLink style={isCurrent} to="/about">회사 소개</NavLink></li>
//       </ul>
//       <hr />
//       <Outlet />
//     </>
//   );
// }