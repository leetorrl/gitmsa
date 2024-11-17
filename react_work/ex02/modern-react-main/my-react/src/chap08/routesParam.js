// import { Route, createBrowserRouter, createRoutesFromElements } from 'react-router-dom';
// import RouterParam from './RouterParam';
// import TopPage from './TopPage';
// import BookPage from './BookPage';

// const routesParam = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterParam />}>
//       <Route path="/" element={<TopPage />} />
//       <Route path="/book/:isbn" element={<BookPage />} />
//     </Route>
//   )
// );

// export default routesParam;



// Code 8-3-5
// import { Route, createBrowserRouter, createRoutesFromElements } from 'react-router-dom';
// import RouterParam from './RouterParam';
// import TopPage from './TopPage';
// import BookPage from './BookPage';

// const routesParam = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterParam />}>
//       <Route path="/" element={<TopPage />} />
//       <Route path="/book/:isbn?" element={<BookPage />} />
//     </Route>
//   )
// );

// export default routesParam;



// Code 8-3-8
// import { Route, createBrowserRouter, createRoutesFromElements } from 'react-router-dom';
// import RouterParam from './RouterParam';
// import TopPage from './TopPage';
// import BookPage from './BookPage';
// import SearchPage from './SearchPage';

// const routesParam = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterParam />}>
//       <Route path="/" element={<TopPage />} />
//       <Route path="/book/:isbn?" element={<BookPage />} />
//       {/* 가변 길이 매개변수 정의 */}
//       <Route path="/search/*" element={<SearchPage />} />
//     </Route>
//   )
// );

// export default routesParam;



// Code 8-3-11
// import { Route, createBrowserRouter, createRoutesFromElements } from 'react-router-dom';
// import RouterParam from './RouterParam';
// import TopPage from './TopPage';
// import BookPage from './BookPage';
// import SearchPage from './SearchPage';
// import NotFoundPage from './NotFoundPage';

// const routesParam = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterParam />}>
//       <Route path="/" element={<TopPage />} />
//       <Route path="/book/:isbn?" element={<BookPage />} />
//       {/* 가변 길이 매개변수 정의 */}
//       <Route path="/search/*" element={<SearchPage />} />
//       {/* 임의의 페이지에 해당하는 루트 */}
//       <Route path="*" element={<NotFoundPage />} />
//     </Route>
//   )
// );

// export default routesParam;



// Code 8-3-15
// import { Route, createBrowserRouter, createRoutesFromElements } from 'react-router-dom';
// import RouterParam from './RouterParam';
// import TopPage from './TopPage';
// import BookPage from './BookPage';
// import SearchPage from './SearchPage';
// import NotFoundPage from './NotFoundPage';
// import BookQueryPage from './BookQueryPage';

// const routesParam = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterParam />}>
//       <Route path="/" element={<TopPage />} />
//       <Route path="/book/:isbn?" element={<BookPage />} />
//       <Route path="/bookQuery" element={<BookQueryPage />} />
//       {/* 가변 길이 매개변수 정의 */}
//       <Route path="/search/*" element={<SearchPage />} />
//       {/* 임의의 페이지에 해당하는 루트 */}
//       <Route path="*" element={<NotFoundPage />} />
//     </Route>
//   )
// );

// export default routesParam;



// Code 8-3-19
// import { Route, createBrowserRouter, createRoutesFromElements } from 'react-router-dom';
// import RouterParam from './RouterParam';
// import TopPage from './TopPage';
// import BookPage from './BookPage';
// import SearchPage from './SearchPage';
// import NotFoundPage from './NotFoundPage';
// import BookQueryPage from './BookQueryPage';
// import BookStatePage from './BookStatePage';

// const routesParam = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterParam />}>
//       <Route path="/" element={<TopPage />} />
//       <Route path="/book/:isbn?" element={<BookPage />} />
//       <Route path="/bookQuery" element={<BookQueryPage />} />
//       <Route path="/bookState" element={<BookStatePage />} />
//       {/* 가변 길이 매개변수 정의 */}
//       <Route path="/search/*" element={<SearchPage />} />
//       {/* 임의의 페이지에 해당하는 루트 */}
//       <Route path="*" element={<NotFoundPage />} />
//     </Route>
//   )
// );

// export default routesParam;



// Code 8-4-2
// import { Route, createBrowserRouter, createRoutesFromElements } from 'react-router-dom';
// import RouterParam from './RouterParam';
// import TopPage from './TopPage';
// import BookPage from './BookPage';
// import SearchPage from './SearchPage';
// import NotFoundPage from './NotFoundPage';
// import BookQueryPage from './BookQueryPage';
// import BookStatePage from './BookStatePage';
// import InvalidParamsPage from './InvalidParamsPage';

// const routesParam = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterParam />} >
//       <Route path="/" element={<TopPage />} />
//       <Route path="/book/:isbn?" element={<BookPage />} 
//         errorElement={<InvalidParamsPage />} />
//       <Route path="/bookQuery" element={<BookQueryPage />} />
//       <Route path="/bookState" element={<BookStatePage />} />
//       {/* 가변 길이 매개변수 정의 */}
//       <Route path="/search/*" element={<SearchPage />} />
//       {/* 임의의 페이지에 해당하는 루트 */}
//       <Route path="*" element={<NotFoundPage />} />
//     </Route>
//   )
// );

// export default routesParam;



// Code 8-4-4
// import { Route, createBrowserRouter, createRoutesFromElements } from 'react-router-dom';
// import RouterParam from './RouterParam';
// import TopPage from './TopPage';
// import BookPage from './BookPage';
// import SearchPage from './SearchPage';
// import NotFoundPage from './NotFoundPage';
// import BookQueryPage from './BookQueryPage';
// import BookStatePage from './BookStatePage';
// import InvalidParamsPage from './InvalidParamsPage';

// const routesParam = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterParam />} 
//       errorElement={<InvalidParamsPage />} >
//       <Route path="/" element={<TopPage />} />
//       <Route path="/book/:isbn?" element={<BookPage />} />
//       <Route path="/bookQuery" element={<BookQueryPage />} />
//       <Route path="/bookState" element={<BookStatePage />} />
//       {/* 가변 길이 매개변수 정의 */}
//       <Route path="/search/*" element={<SearchPage />} />
//       {/* 임의의 페이지에 해당하는 루트 */}
//       <Route path="*" element={<NotFoundPage />} />
//     </Route>
//   )
// );

// export default routesParam;



// Code 8-4-5
// import { Route, createBrowserRouter, createRoutesFromElements } from 'react-router-dom';
// import RouterParam from './RouterParam';
// import TopPage from './TopPage';
// import BookPage from './BookPage';
// import SearchPage from './SearchPage';
// import NotFoundPage from './NotFoundPage';
// import BookQueryPage from './BookQueryPage';
// import BookStatePage from './BookStatePage';
// import InvalidParamsPage from './InvalidParamsPage';
// import WeatherPage from './WeatherPage';

// const routesParam = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterParam />} 
//       errorElement={<InvalidParamsPage />} >
//       <Route path="/" element={<TopPage />} />
//       <Route path="/book/:isbn?" element={<BookPage />} />
//       <Route path="/bookQuery" element={<BookQueryPage />} />
//       <Route path="/bookState" element={<BookStatePage />} />
//       {/* 가변 길이 매개변수 정의 */}
//       <Route path="/search/*" element={<SearchPage />} />
//       <Route path="/weather/:city" element={<WeatherPage />}
//         loader={({ params }) =>
//           fetch(`https://api.openweathermap.org/data/2.5/weather?q=${params.city}&lang=kr&appid=xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx`)
//         }/>
//       {/* 임의의 페이지에 해당하는 루트 */}
//       <Route path="*" element={<NotFoundPage />} />
//       <Route path="/search/*" element={<SearchPage />} />
//     </Route>
//   )
// );

// export default routesParam;



// Code 8-4-8
// import { createBrowserRouter, createRoutesFromElements,
//   json, Route } from 'react-router-dom';
// import RouterParam from './RouterParam';
// import TopPage from './TopPage';
// import BookPage from './BookPage';
// import SearchPage from './SearchPage';
// import NotFoundPage from './NotFoundPage';
// import BookQueryPage from './BookQueryPage';
// import BookStatePage from './BookStatePage';
// import InvalidParamsPage from './InvalidParamsPage';
// import WeatherPage from './WeatherPage';

// const fetchWeather = async ({ params }) => {;
//   const res = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${params.city}&lang=kr&appid=xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx`);
//   // 응답이 성공하면 결과 데이터를 그대로 반환한다.
//   if (res.ok) { return res; }
//   // 성공 이외의 결과에서는 오류 데이터 생성
//   return json({
//     "weather":[
//       {"id":803,"main":"Unknown","description":"알 수 없음","icon":"50d"}
//     ],
//     "name":"알 수 없음"
//   });
// }

// const routesParam = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterParam />} 
//       errorElement={<InvalidParamsPage />} >
//       <Route path="/" element={<TopPage />} />
//       <Route path="/book/:isbn?" element={<BookPage />} />
//       <Route path="/bookQuery" element={<BookQueryPage />} />
//       <Route path="/bookState" element={<BookStatePage />} />
//       {/* 가변 길이 매개변수 정의 */}
//       <Route path="/search/*" element={<SearchPage />} />
//       <Route path="/weather/:city" element={<WeatherPage />}
//         loader={fetchWeather}/>
//       {/* 임의의 페이지에 해당하는 루트 */}
//       <Route path="*" element={<NotFoundPage />} />
//       <Route path="/search/*" element={<SearchPage />} />
//     </Route>
//   )
// );

// export default routesParam;



// import { createBrowserRouter, createRoutesFromElements,
//   json, Route } from 'react-router-dom';
// import RouterParam from './RouterParam';
// import TopPage from './TopPage';
// import BookPage from './BookPage';
// import SearchPage from './SearchPage';
// import NotFoundPage from './NotFoundPage';
// import BookQueryPage from './BookQueryPage';
// import BookStatePage from './BookStatePage';
// import InvalidParamsPage from './InvalidParamsPage';
// import WeatherPage from './WeatherPage';

// const fetchWeather = async ({ params }) => {
//   const res = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${params.city}&lang=kr&appid=xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx`);
//   // 응답이 성공하면 결과 데이터를 그대로 반환한다.
//   if (res.ok) { return res; }
//   // 성공 이외의 결과에서는 오류 데이터 생성
//   return json({
//     "weather":[
//       {"id":803,"main":"Unknown","description":"알 수 없음","icon":"50d"}
//     ],
//     "name":"알 수 없음"
//   });

//   return new Response(
//     JSON.stringify({
//       "weather":[
//         {"id":803,"main":"Unknown","description":"不明","icon":"50d"}
//       ],
//       "name":"알 수 없음 "
//     }),
//     {
//       status: 200,
//       headers: {
//         'Content-Type': 'application/json; UTF-8',
//       },
//     }
//   );
// }

// const routesParam = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterParam />} 
//       errorElement={<InvalidParamsPage />} >
//       <Route path="/" element={<TopPage />} />
//       <Route path="/book/:isbn?" element={<BookPage />} />
//       <Route path="/bookQuery" element={<BookQueryPage />} />
//       <Route path="/bookState" element={<BookStatePage />} />
//       {/* 가변 길이 매개변수 정의 */}
//       <Route path="/search/*" element={<SearchPage />} />
//       <Route path="/weather/:city" element={<WeatherPage />}
//         loader={fetchWeather}/>
//       {/* 임의의 페이지에 해당하는 루트 */}
//       <Route path="*" element={<NotFoundPage />} />
//       <Route path="/search/*" element={<SearchPage />} />
//     </Route>
//   )
// );

// export default routesParam;



// Code 8-4-9
// import { createBrowserRouter, createRoutesFromElements,
//   json, Route } from 'react-router-dom';
// import RouterParam from './RouterParam';
// import TopPage from './TopPage';
// import BookPage from './BookPage';
// import SearchPage from './SearchPage';
// import NotFoundPage from './NotFoundPage';
// import BookQueryPage from './BookQueryPage';
// import BookStatePage from './BookStatePage';
// import InvalidParamsPage from './InvalidParamsPage';
// import WeatherPage from './WeatherPage';

// const fetchWeather = async ({ params }) => {
//   // const res = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${params.city}&lang=kr&appid=xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx`);
//   // 응답이 성공하면 결과 데이터를 그대로 반환한다.
//   if (res.ok) { return res; }
//   // 응답 상태에 따라 다른 오류 정보를 던진다.
//   switch (res.status) {
//     case 404:
//       throw json({ message: 'city is invalid!!' }, { status: 404 });
//     case 401:
//       throw json({ message: 'api key is invalid!!' }, { status: 401 });
//     default:
//       throw json({ message: 'api server is in trouble...' }, { status: 501 });
//   }
// }

// const routesParam = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterParam />} 
//       errorElement={<InvalidParamsPage />} >
//       <Route path="/" element={<TopPage />} />
//       <Route path="/book/:isbn?" element={<BookPage />} />
//       <Route path="/bookQuery" element={<BookQueryPage />} />
//       <Route path="/bookState" element={<BookStatePage />} />
//       {/* 가변 길이 매개변수 정의 */}
//       <Route path="/search/*" element={<SearchPage />} />
//       <Route path="/weather/:city" element={<WeatherPage />}
//         loader={fetchWeather}/>
//       {/* 임의의 페이지에 해당하는 루트 */}
//       <Route path="*" element={<NotFoundPage />} />
//       <Route path="/search/*" element={<SearchPage />} />
//     </Route>
//   )
// );

// export default routesParam;



// Code 8-4-11
// import { createBrowserRouter, createRoutesFromElements,
//   json, Route } from 'react-router-dom';
// import RouterParam from './RouterParam';
// import TopPage from './TopPage';
// import BookPage from './BookPage';
// import SearchPage from './SearchPage';
// import NotFoundPage from './NotFoundPage';
// import BookQueryPage from './BookQueryPage';
// import BookStatePage from './BookStatePage';
// import InvalidParamsPage from './InvalidParamsPage';
// import WeatherPage from './WeatherPage';
// import CommonErrorPage from './CommonErrorPage';

// const fetchWeather = async ({ params }) => {
//   const res = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${params.city}&lang=kr&appid=xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx`);
//   // 응답이 성공하면 결과 데이터를 그대로 반환한다.
//   if (res.ok) { return res; }
//   // 응답 상태에 따라 다른 오류 정보를 던진다.
//   switch (res.status) {
//     case 404:
//       throw json({ message: 'city is invalid!!' }, { status: 404 });
//     case 401:
//       throw json({ message: 'api key is invalid!!' }, { status: 401 });
//     default:
//       throw json({ message: 'api server is in trouble...' }, { status: 501 });
//   }
// }

// const routesParam = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterParam />} 
//       errorElement={<CommonErrorPage />} >
//       <Route path="/" element={<TopPage />} />
//       <Route path="/book/:isbn?" element={<BookPage />} />
//       <Route path="/bookQuery" element={<BookQueryPage />} />
//       <Route path="/bookState" element={<BookStatePage />} />
//       {/* 가변 길이 매개변수 정의 */}
//       <Route path="/search/*" element={<SearchPage />} />
//       <Route path="/weather/:city" element={<WeatherPage />}
//         loader={fetchWeather}/>
//       {/* 임의의 페이지에 해당하는 루트 */}
//       <Route path="*" element={<NotFoundPage />} />
//       <Route path="/search/*" element={<SearchPage />} />
//     </Route>
//   )
// );

// export default routesParam;




// Code 8-4-11
// import { createBrowserRouter, createRoutesFromElements,
//   json, Route } from 'react-router-dom';
// import RouterParam from './RouterParam';
// import TopPage from './TopPage';
// import BookPage from './BookPage';
// import SearchPage from './SearchPage';
// import NotFoundPage from './NotFoundPage';
// import BookQueryPage from './BookQueryPage';
// import BookStatePage from './BookStatePage';
// import InvalidParamsPage from './InvalidParamsPage';
// import WeatherPage from './WeatherPage';
// import CommonErrorPage from './CommonErrorPage';

// const sleep = ms => new Promise(res => setTimeout(res, ms));

// const fetchWeather = async ({ params }) => {
//   // 로딩 메시지를 표시하기 위해 처리 지연
//   await sleep(2000);
//   const res = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${params.city}&lang=kr&appid=xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx`);
//   // 응답이 성공하면 결과 데이터를 그대로 반환한다.
//   if (res.ok) { return res; }
//   // 응답 상태에 따라 다른 오류 정보를 던진다.
//   switch (res.status) {
//     case 404:
//       throw json({ message: 'city is invalid!!' }, { status: 404 });
//     case 401:
//       throw json({ message: 'api key is invalid!!' }, { status: 401 });
//     default:
//       throw json({ message: 'api server is in trouble...' }, { status: 501 });
//   }
// }

// const routesParam = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterParam />} 
//       errorElement={<CommonErrorPage />} >
//       <Route path="/" element={<TopPage />} />
//       <Route path="/book/:isbn?" element={<BookPage />} />
//       <Route path="/bookQuery" element={<BookQueryPage />} />
//       <Route path="/bookState" element={<BookStatePage />} />
//       {/* 가변 길이 매개변수 정의 */}
//       <Route path="/search/*" element={<SearchPage />} />
//       <Route path="/weather/:city" element={<WeatherPage />}
//         loader={fetchWeather}/>
//       {/* 임의의 페이지에 해당하는 루트 */}
//       <Route path="*" element={<NotFoundPage />} />
//       <Route path="/search/*" element={<SearchPage />} />
//     </Route>
//   )
// );

// export default routesParam;



// Code 8-4-15
// import { Route, createBrowserRouter, createRoutesFromElements,
//   json, redirect } from 'react-router-dom';
// import RouterParam from './RouterParam';
// import TopPage from './TopPage';
// import BookPage from './BookPage';
// import SearchPage from './SearchPage';
// import NotFoundPage from './NotFoundPage';
// import BookQueryPage from './BookQueryPage';
// import BookStatePage from './BookStatePage';
// import InvalidParamsPage from './InvalidParamsPage';
// import WeatherPage from './WeatherPage';
// import CommonErrorPage from './CommonErrorPage';
// import BookFormPage from './BookFormPage';
// import yup from '../chap04/yup.kr';
// import { date, number, string } from 'yup';

// const sleep = ms => new Promise(res => setTimeout(res, ms));

// const fetchWeather = async ({ params }) => {
//   // 로딩 메시지를 표시하기 위해 처리 지연
//   await sleep(2000);
//   const res = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${params.city}&lang=kr&appid=xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx`);
//   // 응답이 성공하면 결과 데이터를 그대로 반환한다.
//   if (res.ok) { return res; }
//   // 응답 상태에 따라 다른 오류 정보를 던진다.
//   switch (res.status) {
//     case 404:
//       throw json({ message: 'city is invalid!!' }, { status: 404 });
//     case 401:
//       throw json({ message: 'api key is invalid!!' }, { status: 401 });
//     default:
//       throw json({ message: 'api server is in trouble...' }, { status: 501 });
//   }
// }

// const bookAction = async ({ request }) => {
//   const form = await request.formData();
//   // 스키마 정의
//   const bookSchema = yup.object({
//     title: string().label('도서명').required().max(100),
//     price: number().label('가격').integer().positive(),
//     published: date().label('출간일').required().max(new Date(2100, 0, 1))
//   });
//   let info;
//   // 검증을 실행하고 오류 발생 시 메시지를 반환한다.
//   try {
//     info = await bookSchema.validate({
//       title: form.get('title'),
//       price: form.get('price') || 0,
//       published: new Date(form.get('published') || Date.now()),
//     }, {
//       abortEarly: false
//     });
//     console.log(info);
//     return redirect('/');
//   } catch (e) {
//     return e.errors;
//   }
// };

// const routesParam = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterParam />} >
//       <Route path="/" element={<TopPage />} />
//       <Route path="/book/form" element={<BookFormPage />}
//         action={bookAction} />
//       <Route path="/book/:isbn?" element={<BookPage />} />
//       <Route path="/bookQuery" element={<BookQueryPage />} />
//       <Route path="/bookState" element={<BookStatePage />} />
//       {/* 가변 길이 매개변수 정의 */}
//       <Route path="/search/*" element={<SearchPage />} />
//       <Route path="/weather/:city" element={<WeatherPage />}
//         loader={fetchWeather}/>
//       {/* 임의의 페이지에 해당하는 루트 */}
//       <Route path="*" element={<NotFoundPage />} />
//       <Route path="/search/*" element={<SearchPage />} />
//     </Route>
//   )
// );

// export default routesParam;



// Code 8-4-19
// import { Route, createBrowserRouter, createRoutesFromElements,
//   json, redirect } from 'react-router-dom';
// import RouterParam from './RouterParam';
// import TopPage from './TopPage';
// import BookPage from './BookPage';
// import SearchPage from './SearchPage';
// import NotFoundPage from './NotFoundPage';
// import BookQueryPage from './BookQueryPage';
// import BookStatePage from './BookStatePage';
// import InvalidParamsPage from './InvalidParamsPage';
// import WeatherPage from './WeatherPage';
// import CommonErrorPage from './CommonErrorPage';
// import BookFormPage from './BookFormPage';
// import yup from '../chap04/yup.kr';
// import { date, number, string } from 'yup';

// const bookAction = async ({ request }) => {
//   const form = await request.formData();
//   // 스키마 정의
//   const bookSchema = yup.object({
//     title: string().label('도서명').required().max(100),
//     price: number().label('가격').integer().positive(),
//     published: date().label('출간일').required().max(new Date(2100, 0, 1))
//   });
//   let info;
//   // 검증을 실행하고 오류 발생 시 메시지를 반환한다.
//   try {
//     info = await bookSchema.validate({
//       title: form.get('title'),
//       price: form.get('price') || 0,
//       published: new Date(form.get('published') || Date.now()),
//     }, {
//       abortEarly: false
//     });
//     console.log(info);
//     return redirect('/');
//   } catch (e) {
//     return e.errors;
//   }
// };

// const routesParam = createBrowserRouter(
//   createRoutesFromElements(
//     <Route element={<RouterParam />} >
//       <Route path="/" element={<TopPage />} />
//       <Route path="/book/form" element={<BookFormPage />}
//         action={bookAction} />
//       <Route path="/book/:isbn?" element={<BookPage />} />
//       <Route path="/bookQuery" element={<BookQueryPage />} />
//       <Route path="/bookState" element={<BookStatePage />} />
//       {/* 가변 길이 매개변수 정의 */}
//       <Route path="/search/*" element={<SearchPage />} />
//       <Route path="/weather/:city"
//         lazy={() => import('./WeatherLazyPage')} />
//       {/* 임의의 페이지에 해당하는 루트 */}
//       <Route path="*" element={<NotFoundPage />} />
//       <Route path="/search/*" element={<SearchPage />} />
//     </Route>
//   )
// );

// export default routesParam;



// Code 8-4-21
import { Route, createBrowserRouter, createRoutesFromElements,
  json, redirect } from 'react-router-dom';
import RouterParam from './RouterParam';
import TopPage from './TopPage';
import BookPage from './BookPage';
import SearchPage from './SearchPage';
import NotFoundPage from './NotFoundPage';
import BookQueryPage from './BookQueryPage';
import BookStatePage from './BookStatePage';
import InvalidParamsPage from './InvalidParamsPage';
import WeatherPage from './WeatherPage';
import CommonErrorPage from './CommonErrorPage';
import BookFormPage from './BookFormPage';
import yup from '../chap04/yup.kr';
import { date, number, string } from 'yup';

const bookAction = async ({ request }) => {
  const form = await request.formData();
  // 스키마 정의
  const bookSchema = yup.object({
    title: string().label('도서명').required().max(100),
    price: number().label('가격').integer().positive(),
    published: date().label('출간일').required().max(new Date(2100, 0, 1))
  });
  let info;
  // 검증을 실행하고 오류 발생 시 메시지를 반환한다.
  try {
    info = await bookSchema.validate({
      title: form.get('title'),
      price: form.get('price') || 0,
      published: new Date(form.get('published') || Date.now()),
    }, {
      abortEarly: false
    });
    console.log(info);
    return redirect('/');
  } catch (e) {
    return e.errors;
  }
};

const routesParam = createBrowserRouter(
  createRoutesFromElements(
    <Route element={<RouterParam />} >
      <Route path="/" element={<TopPage />} />
      <Route path="/book/form" element={<BookFormPage />}
        action={bookAction} />
      <Route path="/books" lazy={async ()=> {
        const { BookListPage } = await import('./BookNest');
        return { Component: BookListPage };
      }}>
        <Route path=":isbn" lazy={async ()=> {
          const { BookDetailsPage } = await import('./BookNest');
          return { Component: BookDetailsPage };
        }} />
      </Route>
      <Route path="/bookQuery" element={<BookQueryPage />} />
      <Route path="/bookState" element={<BookStatePage />} />
      {/* 가변 길이 매개변수 정의 */}
      <Route path="/search/*" element={<SearchPage />} />
      <Route path="/weather/:city"
        lazy={() => import('./WeatherLazyPage')} />
      {/* 임의의 페이지에 해당하는 루트 */}
      <Route path="*" element={<NotFoundPage />} />
      <Route path="/search/*" element={<SearchPage />} />
    </Route>
  )
);

export default routesParam;