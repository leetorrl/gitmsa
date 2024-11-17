import { Link, useMatch, useResolvedPath } from 'react-router-dom';
import './RouterNav.css';

export function MyLink({ to, children, ...props }) {
  // 현재 경로와 링크가 일치하는지를 판단한다.
  const resolvedPath = useResolvedPath(to);	
  const isMatch = !!useMatch({
    path: resolvedPath.pathname, end: true });
  // 일치 여부에 따라 링크 또는 평문 텍스트를 반환한다.
  return isMatch ?
    <span className="active">{children}</span> :
    <Link to={to} {...props}>{children}</Link>;
}