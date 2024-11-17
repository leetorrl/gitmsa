// import { Outlet } from 'react-router-dom';

// export default function RouterScroll() {
//   return (
//     <>
//       <Outlet />
//     </>
//   );
// }



// Code 8-5-9
// import { Outlet, ScrollRestoration } from 'react-router-dom';

// export default function RouterScroll() {
//   return (
//     <>
//       <ScrollRestoration />
//       <Outlet />
//     </>
//   );
// }



import { Outlet, ScrollRestoration } from 'react-router-dom';

export default function RouterScroll() {
  return (
    <>
      <ScrollRestoration getKey={(location, matches) => location.pathname} />
      <Outlet />
    </>
  );
}