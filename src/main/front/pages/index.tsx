import Head from 'next/head'
import Image from 'next/image'
import { Inter } from 'next/font/google'
import styles from '@/styles/Home.module.css'

import { Breadcrumb, Layout, Menu, theme } from 'antd';
import React, { useState } from 'react'

const { Header, Content, Footer } = Layout;


interface Props {}

const Index: React.FC<Props> = () => {
  const [inputValue, setInputValue] = useState<string>('')
  const [resultValue, setResultValue] = useState<string>('')

  const handleClick = () => {
    setResultValue(inputValue.toUpperCase())
  }

  const handleInputChange = (event: React.ChangeEvent<HTMLInputElement>) => {
    setInputValue(event.target.value)
  }
  const {
    token: { colorBgContainer },
  } = theme.useToken();

  return (
    <>
    <Layout className="layout">
      <Header>
        <div className="logo" />
        <Menu
          theme="dark"
          mode="horizontal"
          defaultSelectedKeys={['2']}
          items={new Array(3).fill(null).map((_, index) => {
            const key = index + 1;
            return {
              key,
              label: `nav ${key}`,
            };
          })}
        />
      </Header>
      <Content style={{ padding: '20px 10px', backgroundColor: '#787878', minHeight:'500px'}}>
        {/* <Breadcrumb style={{ margin: '16px 0' }}>
          <Breadcrumb.Item>Home</Breadcrumb.Item>
          <Breadcrumb.Item>List</Breadcrumb.Item>
          <Breadcrumb.Item>App</Breadcrumb.Item>
        </Breadcrumb> */}
        <input type="text" value={inputValue} onChange={handleInputChange} style={{width:'50%', height:'30px'}} />
        <button onClick={handleClick}>Click me</button>
        <div style={{background:'#3c3c3c', minHeight:'400px'}}></div>
      </Content>
      <Footer style={{ textAlign: 'center', backgroundColor: '#787878', color:"white"}}>GPT GENERATOR @2023 Created by ME</Footer>
    </Layout>
    </>
  )
}

export default Index
