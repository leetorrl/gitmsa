import axios from 'axios';

const url = 'http://localhost:8080';

export const login = async (code) => {
	try {
		const res = await axios.get(`${url}/kakao/login?code=${code}`);
		console.log('api = ', res.data);
		return res.data;
	} catch (err) {
		console.log(err);
		return err;
	}
};

export const msgSend = async (message) => {
	try {
		const res = await axios.get(`${url}/kakao/msg?message=${message}`, {
			headers: {
				'Content-Type': 'application/json',
				Authorization: `Bearer ${localStorage.getItem('token')}`,
			},
		});
		return res.data;
	} catch (err) {
		console.error(err);
		return err;
	}
};
