import { Helmet } from 'react-helmet-async';
import { useMatches } from 'react-router-dom';

export default function MyHeader(props) {
  let {
    title = '리액트 입문',
    keywords = '리액트, 자바스크립트, 프레임워크',
    description = '리액트 입문용 샘플입니다.'
  } = useMatches().at(-1).handle ?? {};
  // Placeholder에 Props의 값을 반영한다.
  title = title.replace('%s', props.title);
  keywords = keywords.replace('%s', props.keywords);
  description = description.replace('%s', props.description);
  return (
    // <head> 요소에 삽입할 요소 준비하기
    <Helmet>
      <title>{title}</title>
      <meta name="keywords" content={keywords} />
      <meta name="description" content={description} />
    </Helmet>
  );
}