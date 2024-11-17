import { useForm } from 'react-hook-form';
import { yupResolver } from '@hookform/resolvers/yup';
import yup from './yup.kr.js';

const schema = yup.object({
  name: yup
    .string()
    .label('이름')
    .required()
    .max(20),
  gender: yup
    .string()
    .label('성별')
    .required(),
  email: yup
    .string()
    .label('이메일 주소')
    .required()
    .email(),
  memo: yup
    .string()
    .label('비고')
    .required()
    .min(10)
});

export default function FormYup() {
  const { register, handleSubmit, formState: { errors } } = useForm({
    defaultValues: {
      name: '홍길동',
      email: 'admin@example.com',
      gender: 'male',
      memo: ''
    },
    resolver: yupResolver(schema),
  });
  const onsubmit = data => console.log(data);
  const onerror = err => console.log(err);

  return (
  <form onSubmit={handleSubmit(onsubmit, onerror)} noValidate>
      <div>
          <label htmlFor="name">이름:</label><br/>
          <input id="name" type="text"
              {...register('name')} />
          <div>{errors.name?.message}</div>
      </div>
      <div>
          <label htmlFor="gender">성별:</label><br/>
          <label>
          <input type="radio" value="male"
            {...register('gender')} />남성
          </label>
          <label>
          <input type="radio" value="female"
            {...register('gender')} />여성
          </label>
          <div>{errors.gender?.message}</div>
      </div>
      <div>
          <label htmlFor="email">이메일 주소:</label><br/>
          <input id="email" type="email"
              {...register('email')} />
          <div>{errors.email?.message}</div>
      </div>
      <div>
          <label htmlFor="memo">비고:</label><br/>
          <textarea id="memo"
              {...register('memo')} />
          <div>{errors.memo?.message}</div>
      </div>
      <div>
          <button type="submit">비고</button>
      </div>
  </form>
  );
}