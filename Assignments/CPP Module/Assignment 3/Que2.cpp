#include <iostream>
#include <string>
#include <memory>

using namespace std;

//Part A

class Texture
{
private:
    string name;
    int width;
    int height;

public:
    Texture(const string &name,
            int width,
            int height) : name(name), width(width), height(height)
    {
        cout << "[Texture Loaded]" << endl;
    }

    void display() const
    {
        cout << "Texture : " << name << endl;
        cout << "Dimension : " << height << " * " << width << endl;
    }

    ~Texture()
    {
        cout << "[Texture Released]" << endl;
    }
};

//Part B

class Shader
{

private:
    string name;
    string type;

public:
    Shader(const string &name, const string &type) : name(name), type(type)
    {
        cout << " [Shader Compiled]" << endl;
    }

    int getReferenceCount(const shared_ptr<Shader> &ptr)
    {
        return ptr.use_count();
    }

    ~Shader()
    {
        cout << "[Shader Destroyed]" << endl;
    }
};

// Part C

class AudioClip
{

private:
    string name;
    double type;

public:
    AudioClip(const string &name, const double &type) : name(name), type(type)
    {
        cout << " [Shader Compiled]" << endl;
    }

    void setName(const string &n)
    {
        name = n;
    }

    string getName() const
    {
        return name;
    }

    ~AudioClip()
    {
        cout << "[Shader Destroyed]" << endl;
    }
};

int main()
{

    auto tex1 = make_unique<Texture>("player_sprite", 512, 512);

    // unique_ptr<Texture> tex2 = tex1; // Unique_ptr can only have single owner, ownership cannot be transfer.

    tex1->display();

    unique_ptr<Texture> tex2 = move(tex1);
    cout << "tex1 is null: " << (tex1 == nullptr ? "YES" : "NO") << endl;


    // //Part B

    // auto shader = make_shared<Shader>("main_vert", "vertex");

    // // cout << "Ref count: " << shader.use_count() << endl;
    // cout << "Ref count: " << shader->getReferenceCount(shader) << endl;

    // {
    //     auto rendererRef = shader;

    //     // cout << "Ref count: " << shader.use_count() << endl; // 2
    //     cout << "Ref count: " << shader->getReferenceCount(shader) << endl;

    //     auto editorRef = shader;

    //     // cout << "Ref count: " << shader.use_count() << endl; // 3
    //     cout << "Ref count: " << shader->getReferenceCount(shader) << endl;
    // }

    // // cout << "Ref count: " << shader.use_count() << endl; // 1
    // cout << "Ref count: " << shader->getReferenceCount(shader) << endl;

    // //Part C

    // auto audio = make_shared<AudioClip>("explosion", 3.5);
    // weak_ptr<AudioClip> observer = audio;

    // if (auto clip = observer.lock())
    // {

    //     cout << "Clip alive: " << clip->getName() << endl;
    // }

    // audio.reset(); // unload

    // if (observer.expired())
    //     cout << "Clip already unloaded." << endl;

    return 0;
}